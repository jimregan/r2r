package de.fuberlin.wiwiss.r2r;

import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;

import de.fuberlin.wiwiss.r2r.parser.*;

public class SourcePattern {
	private Set<String> prefixDefinitions;
	private String queryBody;
	private Set<String> classes;
	private Set<String> properties;
	private int maxVarLength;
	private Set<String> variablesInPattern;
	
	public Set<String> getVariablesInPattern() {
		return variablesInPattern;
	}

	public Set<String> getClasses() {
		return classes;
	}

	public Set<String> getProperties() {
		return properties;
	}

	public int getMaxVarLength() {
		return maxVarLength;
	}

	private SourcePattern() {}

	public static SourcePattern parseSourcePattern(String sourcePattern, PrefixMapper prefixMapper) {
		CharStream stream =	new ANTLRStringStream(sourcePattern);
		SourcePatternLexer lexer = new SourcePatternLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SourcePatternParser parser = new SourcePatternParser(tokenStream);
		parser.setPrefixMapper(prefixMapper);
		SourcePattern sp = new SourcePattern();
		try {
			SourcePatternParser.sourcePattern_return returnValues = parser.sourcePattern();
			sp.prefixDefinitions = returnValues.usedPrefixes;
			sp.queryBody = sourcePattern;
			sp.classes = returnValues.classes;
			sp.properties = returnValues.properties;
			sp.maxVarLength = returnValues.maxVarLength;
			sp.variablesInPattern = returnValues.vars;
		} catch (RecognitionException e) {
			throw new ParseException(e.getMessage());
		}
		return sp;
	}
	
	public static String rewriteSourcePattern(String sourcePattern, StringGenerator varGenerator) {
		CharStream stream =	new ANTLRStringStream(sourcePattern);
		SourcePatternRewriterLexer lexer = new SourcePatternRewriterLexer(stream);
		TokenStream tokenStream = new TokenRewriteStream(lexer);
		SourcePatternRewriterParser parser = new SourcePatternRewriterParser(tokenStream);
		parser.setVariableGenerator(varGenerator);
		try {
			SourcePatternRewriterParser.rewrittenSourcePattern_return result = parser.rewrittenSourcePattern();
			return result.rewrittenSourcePattern;
		} catch (RecognitionException e) {
			throw new ParseException(e.getMessage());
		}
	}

	public Set<String> getPrefixDefinitions() {
		return prefixDefinitions;
	}

	public String getQueryBody() {
		return queryBody;
	}
}
