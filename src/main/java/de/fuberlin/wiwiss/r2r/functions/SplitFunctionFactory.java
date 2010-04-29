package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class SplitFunctionFactory implements FunctionFactory {
private SplitFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new SplitFunction();
		
		return function;
	}

	private class SplitFunction implements Function {

		public String getURI() {
			return "split";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> resultList = new ArrayList<String>();
			String splitRegEx = arguments.get(0).get(0);
			String stringToSplit = arguments.get(1).get(0);
			String[] splits = stringToSplit.split(splitRegEx);
			for(String split: splits) {
				resultList.add(split);
			}
			return resultList;
		}	
	}
}
