package de.fuberlin.wiwiss.r2r;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import de.fuberlin.wiwiss.r2r.parser.*;

public class FunctionExecution implements Argument{
	private List<Argument> arguments;
	private Function function;
	private String variableName = null;
	private Set<String> variableDependencies = null;
	
	public String getVariableName() {
		return variableName;
	}

	public FunctionExecution(Function function, List<Argument> arguments) {
		this.arguments = arguments;
		this.function = function;
	}

	public List<Argument> getArguments() {
		return arguments;
	}

	public Function getFunction() {
		return function;
	}
	
	public static FunctionExecution parseTransformation(String transformation, FunctionManager functionManager, FunctionMapper functionMapper) {
		CharStream stream =	new ANTLRStringStream(transformation);
		TransformationLexer lexer = new TransformationLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		TransformationParser parser = new TransformationParser(tokenStream);
		parser.setFunctionManager(functionManager);
		parser.setFunctionMapping(functionMapper);
		FunctionExecution fe = null;
		try {	
			TransformationParser.transform_return tr = parser.transform();
			fe = tr.funcExec;
			fe.variableName = tr.variable;
			fe.variableDependencies = Collections.unmodifiableSet(tr.variableDependencies);
		} catch (RecognitionException e) {
			System.err.println(e.getMessage());
			return null;
		}
		return fe;
	}

	public Set<String> getVariableDependencies() {
		return variableDependencies;
	}
}
