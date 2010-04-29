package de.fuberlin.wiwiss.r2r.parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import de.fuberlin.wiwiss.r2r.R2R;
import de.fuberlin.wiwiss.r2r.TargetPattern;
import de.fuberlin.wiwiss.r2r.TargetVocabulary;

import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.query.ResultSet;

/*
 * Some simple parsers.
 */
public class MiniParsers {
	/**
	 * parses a single prefix definition
	 */
	private static String[] parsePrefixDefinition(String prefixDef) {
		//rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
		String[] data = new String[2];
		int index = prefixDef.indexOf(':');
		data[0] = prefixDef.substring(0, index).trim();
		int startIndex = prefixDef.indexOf('<', index+1);
		int stopIndex = prefixDef.indexOf('>', startIndex+1);
		data[1] = prefixDef.substring(startIndex+1, stopIndex);
		return data;
	}
	
	/**
	 * parses a prefix definition string, containing several prefix definitions
	 * @param prefixDefs a String with zero or more prefix definitions
	 * @return a Map containing mappings from prefix -> namespace
	 */
	public static Map<String, String> parsePrefixDefinitions(String prefixDefs) {
		int index = 0;
		int oldIndex = 0;
		Map<String, String> prefixes = new HashMap<String, String>();
		while((index = prefixDefs.indexOf('>', oldIndex))!=-1) {
			String[] pd = parsePrefixDefinition(prefixDefs.substring(oldIndex, index+1));
			prefixes.put(pd[0], pd[1]);
			oldIndex = prefixDefs.indexOf('.', index+1);
			if(oldIndex==-1)
				break;
			else
				oldIndex++;
		}
		return prefixes;
	}
	
	public static Collection<TargetVocabulary> parsePlainTextVocabularyDefinition(String vocabDef) {
		CharStream stream =	new ANTLRStringStream(vocabDef);
		TargetVocabularyLexer lexer = new TargetVocabularyLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		TargetVocabularyParser parser = new TargetVocabularyParser(tokenStream);
		Collection<TargetVocabulary> tvs = null;
		try {
			tvs = parser.targetVocabulary();
		} catch (RecognitionException e) {
			System.err.println(e.getMessage());
			return null;
		}
		return tvs;
	}
	
	public static Collection<TargetVocabulary> parseRDFVocabularyDefinition(Model vocabDefModel) {
		Collection<TargetVocabulary> vocabDefs = new ArrayList<TargetVocabulary>();
		HashSet<String> classRestrictions = new HashSet<String>();
		HashSet<String> classRestrictionsToMap = new HashSet<String>();
		
		// Get class restrictions
		String query = "Select ?cr where { ?s <" + R2R.classRestriction + "> ?cr }";
		ResultSet rs = QueryExecutionFactory.create(query, vocabDefModel).execSelect();

		while(rs.hasNext())
			classRestrictions.add(rs.next().get("cr").toString());
		
		// Get class restrictions that should also be mapped
		query = "Select ?cr where { ?s <" + R2R.classRestrictionAndTarget + "> ?cr }";
		rs = QueryExecutionFactory.create(query, vocabDefModel).execSelect();
		while(rs.hasNext()) {
			String cr = rs.next().get("cr").toString();
			classRestrictions.add(cr);
			classRestrictionsToMap.add(cr);
		}
	
		// Get target entities
		query = "Select ?entity where { ?s <" + R2R.targetProperty + "> ?entity }";
		rs = QueryExecutionFactory.create(query, vocabDefModel).execSelect();
		Collection<String> entities = new HashSet<String>();
		while(rs.hasNext())
			entities.add(rs.next().get("entity").toString());
		
		if(classRestrictions.size()==0)
			vocabDefs.add(new TargetVocabulary(null, entities, false));
		else {
			for(String classRestriction: classRestrictions) {
				boolean addMappingForCR = classRestrictionsToMap.contains(classRestriction);
				vocabDefs.add(new TargetVocabulary(classRestriction, entities, addMappingForCR));
			}
		}
		
		return vocabDefs;
	}
}
