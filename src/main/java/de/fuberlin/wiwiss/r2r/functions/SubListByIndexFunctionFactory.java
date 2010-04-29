package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class SubListByIndexFunctionFactory implements FunctionFactory {
private SubListByIndexFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new SubListByIndexFunction();
		
		return function;
	}

	private class SubListByIndexFunction implements Function {

		public String getURI() {
			return "subListByIndex";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> resultList = new ArrayList<String>();
			List<String> list = arguments.get(0);
			
			for(int i=1; i<arguments.size(); i++) {
				int index = Integer.parseInt(arguments.get(i).get(0));
				resultList.add(list.get(index));
			}
			return resultList;
		}	
	}
}
