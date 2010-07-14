package de.fuberlin.wiwiss.r2r;

import java.util.List;
import java.util.ArrayList;
import com.hp.hpl.jena.rdf.model.Model;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import de.fuberlin.wiwiss.r2r.functions.HelperFunctions;
import de.fuberlin.wiwiss.r2r.parser.*;
import de.fuberlin.wiwiss.r2r.parser.TargetPatternParser.targetPattern_return;
import com.hp.hpl.jena.datatypes.TypeMapper;
import com.hp.hpl.jena.datatypes.RDFDatatype;

import de.fuberlin.wiwiss.r2r.TripleElement.Type;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.util.PrintUtil;

import java.util.Set;
import java.util.Map;

/**
 * Java representation of the Target Pattern R2R language element.
 * @author andreas
 *
 */
public class TargetPattern {
	private List<Triple> path;
	private Set<String> variableDependencies;
	private Set<String> classes;
	private Set<String> properties;
	private Map<String, String> hints;
	private static Log log = LogFactory.getLog(TargetPattern.class);
	private Mapping mapping = null;
	
	public Set<String> getVariableDependencies() {
		return variableDependencies;
	}

	public TargetPattern(List<Triple> path) {
		this.path = path;
	}
	
	public void setMapping(Mapping mapping) {
		this.mapping = mapping;
	}

	/*
	 * Generate all triples given the variable results of the query and transformations
	 * @param model		The model to add the triples to
	 * @param results	A variable binding of the source pattern and the transformation results
	 * @param group		A group identifier to use when generating blank nodes (in order to separate identifiers across result sets) 
	 */
	public void addTargetTriplesToModel(Model model, VariableResults results, int blankNodeGroup, String termURI) {
		for(Triple triple: path) {
			if(triple.getPropertyURI().equals(termURI) || (triple.getClassURI()!=null && triple.getClassURI().equals(termURI))) {
				List<String> subjectVals = getSubjectValues(triple.getSubject(), results);
				List<String> verbVals = getVerbValues(triple.getVerb());
	
				for(String subjectVal: subjectVals) {
					Resource subject;
					if(subjectVal.startsWith("_:")) {
						subject = model.createResource(new AnonId(blankNodeGroup + "_" + subjectVal.substring(2)));
					} else {
						subject = model.createResource(subjectVal);
					}
					for(String verb: verbVals) {
						Property property = model.createProperty(verb);
						addObjectsToStatement(subject, property, triple.getObject(), results, model, blankNodeGroup);
					}
				}
			}
		}
	}
	
	/*
	 * TODO: could be nicer :)
	 */
	private void addObjectsToStatement(Resource subject, Property property, TripleElement object, VariableResults results, Model model, int blankNodeGroup) {
		TypeMapper typeMapper = TypeMapper.getInstance();
		//Handle IRI result types
		Type type = object.getType();
		if(type==Type.IRI || type==Type.IRIVARIABLE) {
			List<String> iris = getIriValuesOfTripleElement(object, results);
			for(String iri: iris) {
				Resource iriResource;
				if (iri.startsWith("_:")) {
					iriResource = model.createResource(new AnonId(blankNodeGroup + "_" + iri.substring(2)));
				} else {
					iriResource = model.createResource(iri);					
				}
				subject.addProperty(property, iriResource);
			}
		}
		else if(type==Type.DATATYPESTRING || type==Type.DATATYPEVARIABLE) {
			List<String> values = null;
			if(type==Type.DATATYPEVARIABLE) 
				values = getDataTypeVariableValues(object, results);
			else {
				values = new ArrayList<String>();
				values.add(object.getValue(0));
			}
			RDFDatatype datatype = typeMapper.getTypeByName(PrintUtil.expandQname(object.getValue(1)));

			for(String value: values) {
				subject.addProperty(property, value, datatype);
			}
		}
		else if(type==Type.STRING || type==Type.STRINGVARIABLE) {
			List<String> values = null;
			if(type==Type.STRINGVARIABLE)
				values = results.getResults(object.getValue(0));
			else {
				values = new ArrayList<String>();
				values.add(object.getValue(0));
			}
			for(String value: values)
				subject.addProperty(property, value);
		}
		else if(type==Type.LANGTAGSTRING || type==Type.LANGTAGVARIABLE) {
			List<String> values = null;
			if(type==Type.LANGTAGVARIABLE)
				values = results.getResults(object.getValue(0));
			else {
				values = new ArrayList<String>();
				values.add(object.getValue(0));
			}
			String langtag = object.getValue(1);
			for(String value: values) {
				subject.addProperty(property, value, langtag);
			}
		}
		else if (type==Type.VARIABLE) {
			RDFNode node = results.getRDFNode(object.getValue(0));
			if(node!=null)
				subject.addProperty(property, node);
			else {
				List<String> values = results.getResults(object.getValue(0));
				for(String value: values) {
					subject.addProperty(property, value);
				}
			}
		}
		else {
			RDFDatatype datatype = null;
			if(type==Type.BOOLEAN) {
				datatype = typeMapper.getTypeByName(PrintUtil.expandQname("xsd:boolean"));
			} else if(type==Type.DECIMAL) {
				datatype = typeMapper.getTypeByName(PrintUtil.expandQname("xsd:decimal"));
			} else if(type==Type.INTEGER) {
				datatype = typeMapper.getTypeByName(PrintUtil.expandQname("xsd:integer"));
			} else if(type==Type.DOUBLE) {
				datatype = typeMapper.getTypeByName(PrintUtil.expandQname("xsd:double"));
			}
			subject.addProperty(property, object.getValue(0), datatype);
		}
	}

	private List<String> getDataTypeVariableValues(TripleElement object,
			VariableResults results) {
		List<String> values;
		String var = object.getValue(0);
		values = results.getResults(var);
		String hint = hints.get(var);
		// If data type hint is a known type, apply conversion
		if(HelperFunctions.getWorkingDataTypeOfDataTypeString(hint)!=null) {
			List<String> tempList = values;
			values = new ArrayList<String>();
			for(String value: tempList) {
				String convertedValue = null;
				try {
					convertedValue = HelperFunctions.convertValueToDataType(value, hint);
				} catch(NumberFormatException e) {
					if(log.isDebugEnabled())
						log.debug("NumberFormatException: In mapping <" + mapping.getUri() + "> of variable ?" + var + " for value: " +value);
					continue;
				}
				values.add(convertedValue);
			}
		}
		return values;
	}
	
	private List<String> getIriValuesOfTripleElement(TripleElement element, VariableResults results) {
		List<String> iris = null;
		if(element.getType()==Type.IRI) {
			iris = new ArrayList<String>();
			iris.add(element.getValue(0));
		}
		else 
			iris = results.getResults(element.getValue(0));

		return iris;
	}
	
	private List<String> getSubjectValues(TripleElement element, VariableResults results) {
		List<String> subjects = null;
		Type type = element.getType();
		subjects = new ArrayList<String>();
		if(type==Type.IRI) {
			subjects.add(element.getValue(0));
		} else {
			String varName = element.getValue(0);
			//only IRIVARIABLE and VARIABLE possible
			if(type==Type.VARIABLE) {
				RDFNode node = results.getRDFNode(varName);
				if(node!=null && (!node.isResource())) {
					//Node is no resource thus cannot be in the subject position => do not add => do nothing!
				}
				else
					subjects= results.getResults(varName);
			}
			else
				subjects = results.getResults(varName);
		}
		return subjects;
	}
	
	private List<String> getVerbValues(TripleElement element) {
		//Can only be IRI
		List<String> subjects = new ArrayList<String>();
		subjects.add(element.getValue(0));
		return subjects;
	}
 
	public static TargetPattern parseTargetPattern(String targetPattern, PrefixMapper prefixMapper) {
		CharStream stream =	new ANTLRStringStream(targetPattern);
		TargetPatternLexer lexer = new TargetPatternLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		TargetPatternParser parser = new TargetPatternParser(tokenStream);
		parser.setPrefixMapper(prefixMapper);
		TargetPattern tp = null;
		try {
			targetPattern_return retVal = parser.targetPattern();
			tp = retVal.pattern;
			tp.hints = retVal.hints;
			tp.variableDependencies = retVal.variableDependencies;
			tp.classes = retVal.classes;
			tp.properties = retVal.properties;
		} catch (RecognitionException e) {
			System.err.println(e.getMessage());
			return null;
		}
		return tp;
	}

	public Map<String, String> getHints() {
		return hints;
	}

	public Set<String> getClasses() {
		return classes;
	}

	public Set<String> getProperties() {
		return properties;
	}
}
