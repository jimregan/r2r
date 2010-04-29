package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class ListConcatFunctionFactory implements FunctionFactory {
	private ListConcatFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new ListConcatFunction();
		
		return function;
	}

	private class ListConcatFunction implements Function {

		public String getURI() {
			return "listConcat";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> resultList = new ArrayList<String>();
			
			for(List<String> argumentlist: arguments) {
				resultList.addAll(argumentlist);
			}
			return resultList;
		}	
	}
}
