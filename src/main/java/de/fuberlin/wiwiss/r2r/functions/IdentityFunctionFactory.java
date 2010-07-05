package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class IdentityFunctionFactory implements FunctionFactory {
	private IdentityFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new IdentityFunction();
		
		return function;
	}

	private static class IdentityFunction implements Function {
		
		public String getURI() {
			return "identityFunction";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			return arguments.get(0);
		}	
	}
}
