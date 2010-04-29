package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class ListFunctionFactory implements FunctionFactory {
	private ListFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new ListFunction();
		
		return function;
	}

	private class ListFunction implements Function {

		public String getURI() {
			return "list";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> list = new ArrayList<String>();
			
			for(List<String> argumentlist: arguments) {
				for(String argument: argumentlist) {
					list.add(argument);
				}
			}
			return list;
		}	
	}
}
