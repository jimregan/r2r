package de.fuberlin.wiwiss.r2r.functions;

import java.util.List;
import java.util.ArrayList;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class ConcatFunctionFactory implements FunctionFactory {
	ConcatFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new ConcatFunction();
		
		return function;
	}
	
	private class ConcatFunction implements Function {
		
		public String getURI() {
			return "concat";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			StringBuilder concatString = new StringBuilder();
			for(List<String> list: arguments) {
				concatString.append(list.get(0));
			}
			ArrayList<String> r = new ArrayList<String>();
			r.add(concatString.toString());
			return r;
		}	
	}
}
