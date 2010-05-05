package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class ListJoinFunctionFactory implements FunctionFactory {
	private ListJoinFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new ListJoinFunction();
		
		return function;
	}

	private class ListJoinFunction implements Function {

		public String getURI() {
			return "infixListConcat";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			StringBuilder concatString = new StringBuilder();
			String infix = arguments.get(0).get(0);
			boolean inside = false;
			for(String part: arguments.get(1)) {
				if(inside)
					concatString.append(infix);
				else
					inside = true;
				concatString.append(part);
			}
			ArrayList<String> r = new ArrayList<String>();
			r.add(concatString.toString());
			return r;
		}	
	}
}
