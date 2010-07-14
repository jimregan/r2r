package de.fuberlin.wiwiss.r2r;

import java.math.BigInteger;
import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.query.*;

import com.hp.hpl.jena.util.PrintUtil;

import de.fuberlin.wiwiss.r2r.parser.MiniParsers;
import de.fuberlin.wiwiss.r2r.parser.ParseException;

/**
 * A Mapping object represents a mapping of the R2R mapping language.
 * @author andreas
 *
 */
public class Mapping {
	private List<TargetPattern> targetPatterns;
	private List<FunctionExecution> functions;
	private PrefixMapper prefixMapper;
	private Set<String> prefixes;
	private FunctionMapper functionMapper;
	private Set<String> variableDependenciesOfTargetPatterns;
	private Set<String> variableDependenciesOfTransformations;
	private Set<String> transformationGeneratedVariables;
	private Map<String, String> datatypeHints;
	private SourcePattern sourcePattern;
	private String uri;
	public SourcePattern getSourcePattern() {
		return sourcePattern;
	}

	private String parentMapping;
	private boolean classMapping;
	private static Log log = LogFactory.getLog(Mapping.class);
	
	public boolean isClassMapping() {
		return classMapping;
	}

	public String getUri() {
		return uri;
	}
	
	private Mapping() {}
	
	private Mapping(String uri) {
		targetPatterns = new ArrayList<TargetPattern>();
		variableDependenciesOfTargetPatterns = new HashSet<String>();
		variableDependenciesOfTransformations = new HashSet<String>();
		transformationGeneratedVariables = new HashSet<String>();
		prefixMapper = new PrefixMapper();
		functionMapper = new FunctionMapper();
		functions = new ArrayList<FunctionExecution>();
		prefixes = new HashSet<String>();
		parentMapping = null;
		datatypeHints = new HashMap<String, String>();
		this.uri = uri;
	}
	
	/**
	 * 
	 * @param uri URI of the created mapping
	 * @param parentUri URI of the parent mapping
	 * @param prefixDefinitions a String containing prefix definitions needed for the source and target patterns
	 * @param targetPatterns a list of target patterns
	 * @param transformations list of transformations
	 * @param sourcePattern the source pattern of the mapping
	 * @param isClassMapping true if the created mapping is a class mapping
	 * @return the mapping object created from the arguments
	 */
	public static Mapping createMapping(String uri, String parentUri, List<String> prefixDefinitions, List<String> targetPatterns, List<String> transformations, String sourcePattern, boolean isClassMapping, List<String> functionImports, FunctionManager functionManager) {
		Mapping mapping = new Mapping(uri);
		mapping.parentMapping = parentUri;
		try {
			for(String prefixDef: prefixDefinitions)
				mapping.addPrefixDefinitions(prefixDef);
			
			for(String functionImport: functionImports)
				mapping.addFunctionMapping(functionImport);
			
			for(String targetPattern: targetPatterns)
				mapping.addTargetPattern(targetPattern);
			
			for(String transformation: transformations)
				mapping.addTransformation(transformation, functionManager);
			
			mapping.addSourcePattern(sourcePattern);
			
			mapping.classMapping = isClassMapping;
			
			String error = hasCorrectVariableDependencies(mapping);
			if(error.length()>0) {
				if(log.isDebugEnabled())
					log.debug("Errors found in Mapping <" + mapping.getUri() + ">: " + error);
				return null;
			}
		} catch(ParseException e) {
			if(log.isDebugEnabled())
				log.debug("Could not create mapping with URI <" + uri + ">: ParseException: " + e.getMessage());
			return null;
		} catch(IllegalArgumentException e) {
			if(log.isDebugEnabled())
				log.debug("Could not create mapping with URI <" + uri + ">: " + e.getMessage());
			return null;
		}
		if(log.isTraceEnabled())
			log.trace("Sucessfully created mapping <" + uri + ">");
		return mapping;
	}
	
	/**
	 * creates a mapping, where the list of source patterns are connected conjunctively
	 * @param uri URI of the mapping
	 * @param parentUri URI of its parent mapping
	 * @param prefixDefinitions prefix definition string for prefixes used in source and target patterns
	 * @param targetPatterns list of target patterns
	 * @param transformations list of transformations
	 * @param sourcePatterns list of source patterns that must all be matched
	 * @param isClassMapping true if this mapping is a class mapping
	 * @return The mapping object.
	 */
	public static Mapping createMapping(String uri, String parentUri, List<String> prefixDefinitions, List<String> targetPatterns, List<String> transformations, List<String> sourcePatterns, boolean isClassMapping, List<String> functionImports, FunctionManager functionManager) {
		return createMapping(uri, parentUri, prefixDefinitions, targetPatterns, transformations, conjunctiveCombineSourcePatterns(sourcePatterns), isClassMapping, functionImports, functionManager);
	}
	
	private static String conjunctiveCombineSourcePatterns(List<String> sourcePatterns) {
		StringBuilder sb = new StringBuilder();
		for(String sourcePattern: sourcePatterns) {
			sb.append("{");
			sb.append(sourcePattern);
			sb.append("} ");
		}
		return sb.toString();
	}
	
	private void addTransformation(String transformation, FunctionManager functionManager) {
		FunctionExecution funcExec = FunctionExecution.parseTransformation(transformation, functionManager, functionMapper);
		variableDependenciesOfTransformations.addAll(funcExec.getVariableDependencies());
		transformationGeneratedVariables.add(funcExec.getVariableName());
		functions.add(funcExec);
	}
	
	private void addFunctionMapping(String importString) {
		String[] mapping = importString.split("=", 2);
		if(mapping.length>1)
		functionMapper.setMapping(mapping[0].trim(), mapping[1].trim());
	}
	
	private void addPrefixDefinitions(String prefixDefs) {
		Map<String, String> prefixes = MiniParsers.parsePrefixDefinitions(prefixDefs);
		for(Map.Entry<String, String> prefix: prefixes.entrySet()) {
			prefixMapper.registerPrefix(prefix.getKey(), prefix.getValue());
			this.prefixes.add(prefix.getKey());
		}
	}
	
	private void addTargetPattern(String targetPattern) {
		TargetPattern tp = TargetPattern.parseTargetPattern(targetPattern, prefixMapper);
		tp.setMapping(this);
		datatypeHints.putAll(tp.getHints());
		variableDependenciesOfTargetPatterns.addAll(tp.getVariableDependencies());
		targetPatterns.add(tp);
	}
	
	private void addSourcePattern(String sourcePattern) {
		this.sourcePattern = SourcePattern.parseSourcePattern(sourcePattern, prefixMapper);
	}
	
	// Execute a function, resolve all arguments first
	private List<String> execFunction(FunctionExecution functionExecution, VariableResults varResults, String datatypeHint) {
		List<Argument> arguments = functionExecution.getArguments();
		List<List<String>> realArguments = new ArrayList<List<String>>();
		Function function = functionExecution.getFunction();

		List<String> returnList = null;
	  try {
		for(Argument argument: arguments) {
			if(argument instanceof ConstantArgument) {
				ArrayList<String> arg = new ArrayList<String>();
				arg.add(((ConstantArgument) argument).getValue());
				realArguments.add(arg);
			}
			else if(argument instanceof VariableArgument) {
				String varName = ((VariableArgument) argument).getVariableName();
				//Make the argument List unmodifiable to protect against "defect" functions 
				realArguments.add(Collections.unmodifiableList(varResults.getResults(varName)));
			}
			else if(argument instanceof FunctionExecution) {
				realArguments.add(execFunction((FunctionExecution)argument, varResults, datatypeHint));
			}
		}
	    
		returnList = function.execute(realArguments, datatypeHint);
	  } catch(NumberFormatException e) {
		  String msg = "Could not execute function <" + function.getURI() + "> correctly: " + e.toString();
		  throw new FunctionExecutionException(msg, e);
	  }
	  catch(RuntimeException e) {
		  String msg = "Exception while executing function <" + function.getURI() + ">: " + e;
		  throw new FunctionExecutionException(msg, e);
	  }
		return returnList;
	}
	
	// Execute all functions to generate all values needed by the target patterns
	private void executeAllFunctions(VariableResults varResults) {
		for(FunctionExecution funcExec: functions) {
			String resultVariableName = funcExec.getVariableName();
			String hint = datatypeHints.get(resultVariableName);
			if(hint==null)
				hint = "";
	
			List<String> resultValues = null;
			try {
				resultValues = execFunction(funcExec, varResults, hint);
			} catch(FunctionExecutionException fee) {
				if(log.isDebugEnabled()) {
					String msg = "Mapping <" + getUri() + ">: Function for variable ?" + resultVariableName + " interrupted with an exception: " + fee.getMessage();
					log.debug(msg);
				}
				// Create an empty list, so target pattern using these function results just generate no triples
				resultValues = new ArrayList<String>();
			}
			varResults.addVariableResult(resultVariableName, resultValues);
		}
	}

	public long executeMapping(Source in, Output out) {
		return executeMappingInOtherMappingContext(in, out, null, null);
	}
	
	public long executeMapping(Source in, Output out, Collection<String> propertyUris) {
		return executeMappingInOtherMappingContext(in, out, null, propertyUris);
	}
	
	public long executeMappingInOtherMappingContext(Source in, Output out, Collection<Mapping> mappingContext) {
		return executeMappingInOtherMappingContext(in, out, mappingContext, null);
	}
	
	/**
	 * Execute this mapping against a source. The mapping is further restricted by ALL mapping restrictions in conjunction. 
	 * @param in Input Source object
	 * @param out Output object
	 * @param mappingRestrictions the mapped instances have to conform to these restrictions
	 * @param entityURIs the target entities. Only target pat(Mapping.java:264)
terns of this mapping containing one of these URIs are executed.
	 * @return Number of triples generated
	 */
	public long executeMappingInOtherMappingContext(Source in, Output out, Collection<Mapping> mappingRestrictions, Collection<String> entityURIs) {
		int results = 0;//TODO: return number of triples
		Model outputModel = out.getOutputModel();
		ResultSet resultSet = null;
		
		String query = null;
		if(mappingRestrictions==null)
			query = buildQuery();
		else
			query = buildQueryWithContext(mappingRestrictions);

		resultSet = in.executeSelectQuery(query);
		
		while(resultSet.hasNext()) {
			QuerySolution solution = resultSet.next();
			VariableResults varResults = new VariableResults(solution);
			Set<String> variableDependencies = computeQueryVariableDependencies();
			for(String var: variableDependencies) {
				RDFNode node = solution.get(var);
				List<String> resList = new ArrayList<String>();

				if(node.isLiteral()) {
					Literal lit = (Literal) node;
					resList.add(lit.getLexicalForm());
				} else {
					resList.add(node.toString());
				}
				varResults.addVariableResult(var, resList);
			}
			executeAllFunctions(varResults);
			if(entityURIs==null)
				executeTargetPatterns(varResults, outputModel);
			else
				executeTargetPatterns(varResults, outputModel, entityURIs);
		}
		out.write(outputModel);
		
		return results;
	}
	
	private Set<String> computeQueryVariableDependencies() {
		Set<String> varDependencies = new HashSet<String>();
		varDependencies.addAll(variableDependenciesOfTargetPatterns);
		varDependencies.addAll(variableDependenciesOfTransformations);
		varDependencies.removeAll(transformationGeneratedVariables);
		return varDependencies;
	}
	
	private String buildQueryWithContext(Collection<Mapping> contextMappings) {
		StringBuilder sb = new StringBuilder();
		//Prefixes and maxVarLength
		Integer maxvarLength = sourcePattern.getMaxVarLength();
		Set<String> prefixDependencies = new HashSet<String>();
		prefixDependencies.addAll(sourcePattern.getPrefixDefinitions());
		if(contextMappings!=null)
			for(Mapping contextMapping: contextMappings) {
				prefixDependencies.addAll(contextMapping.sourcePattern.getPrefixDefinitions());
				if(contextMapping.sourcePattern.getMaxVarLength()>maxvarLength)
					maxvarLength = contextMapping.sourcePattern.getMaxVarLength();
			}
		
		sb.append(createPrefixPartOfQuery(contextMappings, prefixDependencies));

		sb.append("SELECT ");
		Set<String> varDependencies = computeQueryVariableDependencies();
		for(String var: varDependencies) {
			sb.append(" ?" + var);
		}
		sb.append("\nWHERE {");
		sb.append("{");
		sb.append(sourcePattern.getQueryBody());
		sb.append("}");
		if(contextMappings!=null) {
			String rewriteVar = getVarnameOfLength(maxvarLength);
			StringGenerator sg = new EnumeratingURIGenerator(rewriteVar, BigInteger.ONE);
			for(Mapping contextMapping: contextMappings) {
				// rewrite source pattern to avoid variable collision
				String sp = SourcePattern.rewriteSourcePattern(contextMapping.sourcePattern.getQueryBody(), sg);
				sb.append("{");
				sb.append(sp);
				sb.append("}");
			}
		}
		sb.append(" }");
		return sb.toString();
	}
	
	private String getVarnameOfLength(int length) {
		StringBuilder sb = new StringBuilder();
		while(length-->0)
			sb.append("v");
		return sb.toString();
	}
	
	// Returns empty String if everything is OK, else it returns an error message
	private static String hasCorrectVariableDependencies(Mapping mapping) {
		StringBuilder error = new StringBuilder();
		Set<String> variablesForTargetPattern = new HashSet<String>();
		Set<String> targetPatternVariablesDep = mapping.variableDependenciesOfTargetPatterns;
		Set<String> transformationVariablesDep = mapping.variableDependenciesOfTransformations;
		Set<String> transformationGeneratedVariables=  mapping.transformationGeneratedVariables;
		Set<String> sourcePatternVariables = mapping.sourcePattern.getVariablesInPattern();
		
		variablesForTargetPattern.addAll(transformationGeneratedVariables);
		variablesForTargetPattern.addAll(sourcePatternVariables);
		
		// Transformations depend on source pattern variables
		for(String var: transformationVariablesDep)
			if(!sourcePatternVariables.contains(var)) {
				error.append("Transformation definition depends on non existing variable: ?");
				error.append(var);
				error.append(" of the source pattern. ");
			}
		
		// Target Pattern depend on source pattern AND transformation variables
		for(String var: targetPatternVariablesDep)
			if(!variablesForTargetPattern.contains(var)) {
				error.append("Target Pattern definition depends on non existing variable: ?");
				error.append(var);
				error.append(". ");
			}
		
		return error.toString();
	}
	
	/*
	 * Create Prefix definitions for the query
	 */
	private String createPrefixPartOfQuery(Collection<Mapping> contextMappings, Collection<String> prefixDependencies) {
		StringBuilder sb = new StringBuilder();
		for(String prefix: prefixDependencies) {
			String ns=null;
			if(contextMappings==null)
				ns = expandPrefix(prefix);
			else {
				for(Mapping contextMapping: contextMappings) {
					ns = expandPrefix(prefix, contextMapping.prefixMapper);
					if(ns!=null)
						break;//Prefix found, break!
				}
			}
			
			if(ns==null) {
				if(contextMappings==null)
					throw new RuntimeException("No prefix definition for prefix " + prefix + " in mapping <" + uri + "> found!");
				else {
					StringBuilder errorString = new StringBuilder(); 
					errorString.append("No prefix definition for prefix ").append(prefix).append(" in mapping <" + uri + ">");
					for(Mapping contextMapping: contextMappings)
						errorString.append(" or <").append(contextMapping.uri).append(">");
					errorString.append(" found!");
					throw new RuntimeException(errorString.toString());
				}
			}
			sb.append("prefix " + prefix + ": <" + ns + ">\n");
		}
		return sb.toString();
	}
	
	private String buildQuery() {
		return buildQueryWithContext(null);
	}
	
	/*
	 * Get the namespace URI of a prefix
	 */
	private String expandPrefix(String prefix) {
		return expandPrefix(prefix, null);
	}
	
	private String expandPrefix(String prefix, PrefixMapper contextPrefixMapper) {
		String ns = prefixMapper.resolvePrefix(prefix);
		if(ns==null && contextPrefixMapper!=null)//TODO: Refactor: eliminate redundant execution
			ns = contextPrefixMapper.resolvePrefix(prefix);
		if(ns==null) {
			ns = prefix + ":";
			String prefixUri = PrintUtil.expandQname(ns);
			if(prefixUri.equals(ns))
				ns = null;
			else
				ns = prefixUri;
		}
		return ns;
	}
	
	private static int blankNodeGroups = 0;

	private int getBlankNodeGroup() {
        synchronized (Mapping.class) {
            return blankNodeGroups++;
        }
	}
	
	private void executeTargetPatterns(VariableResults varResults, Model out) {
		int group = getBlankNodeGroup();
		for(TargetPattern targetPattern: targetPatterns) {
			targetPattern.addTargetTriplesToModel(out, varResults, group, null);
		}
	}
	
	/*
	 * Only execute Target Patterns that contain the given Property
	 */
	private void executeTargetPatterns(VariableResults varResults, Model out, Collection<String> termURIs) {
		int group = getBlankNodeGroup();
		for(TargetPattern targetPattern: targetPatterns)
			for(String termURI: termURIs)
				if(targetPattern.getClasses().contains(termURI) || targetPattern.getProperties().contains(termURI)) {
					targetPattern.addTargetTriplesToModel(out, varResults, group, termURI);
					break;
				}
	}
	
	public void insertMappingMetaDataIntoJenaModel(Model model) {
		Resource mapping = model.createResource(uri);
		//Meta data properties
		Property dependsOnClass = model.createProperty(R2R.dependsOn);
		Property dependsOnProperty = model.createProperty(R2R.dependsOn);
		Property mapsToClass = model.createProperty(R2R.mapsTo);
		Property mapsToProperty = model.createProperty(R2R.mapsTo);
		
		//parent mapping dependency
		if(this.parentMapping!=null) {
			Property classMappingRef = model.createProperty(R2R.classMappingRef);
			Resource parentMap = model.createResource(this.parentMapping);
			mapping.addProperty(classMappingRef, parentMap);
		}
		
		createMapsToMetaData(model, mapping, mapsToClass, mapsToProperty);
		
		createDependsOnMetaData(model, mapping, dependsOnClass,
				dependsOnProperty);
	}

	private void createMapsToMetaData(Model model, Resource mapping,
			Property mapsToClass, Property mapsToProperty) {
		for(TargetPattern tp: targetPatterns) {
			for(String cl: tp.getClasses()) {
				Resource classResource = model.createResource(cl); 
				mapping.addProperty(mapsToClass, classResource);
			}
			for(String prop: tp.getProperties()) {
				Resource propResource = model.createResource(prop); 
				mapping.addProperty(mapsToProperty, propResource);
			}
		}
	}

	private void createDependsOnMetaData(Model model, Resource mapping,
			Property dependsOnClass, Property dependsOnProperty) {
		for(String cl: sourcePattern.getClasses()) {
			Resource classResource = model.createResource(cl); 
			mapping.addProperty(dependsOnClass, classResource);
		}
		for(String prop: sourcePattern.getProperties()) {
			Resource propResource = model.createResource(prop); 
			mapping.addProperty(dependsOnProperty, propResource);
		}
	}
	
	public Model getJenaModelWithMappingMetaData() {
		Model model = ModelFactory.createDefaultModel();
		insertMappingMetaDataIntoJenaModel(model);
		return model;
	}
	
//	public Model getJenaModelWithExtendedMappingMetaData() {
//		Model model = getJenaModelWithMappingMetaData();
//		Resource mapping = model.createResource(uri);
//		for(TargetPattern tp: targetPatterns)
//			createTransformationInvolvedForMetaData(model, mapping, tp);
//
//		return model;
//	}

//	private void createTransformationInvolvedForMetaData(Model model,
//			Resource mapping, TargetPattern tp) {
//		Set<String> tpDeps = tp.getVariableDependencies();
//		boolean dependend = false;
//		for(String dep: tpDeps)
//			if(transformationGeneratedVariables.contains(dep))
//				dependend = true;
//		if(dependend) {
//			for(String prop: tp.getProperties()) {
//				mapping.addProperty(model.createProperty(R2R.transformationInvolvedFor), model.createResource(prop));
//			}
//		}
//	}

}
