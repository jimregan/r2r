package de.fuberlin.wiwiss.r2r.functions;

import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class SubListFunctionFactory implements FunctionFactory {
	private SubListFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new SubListFunction();
		
		return function;
	}

	private static class SubListFunction implements Function {

		public String getURI() {
			return "subList";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			int from = Integer.parseInt(arguments.get(1).get(0));
			int to = Integer.parseInt(arguments.get(2).get(0));
			return arguments.get(0).subList(from, to);
		}	
	}
}
