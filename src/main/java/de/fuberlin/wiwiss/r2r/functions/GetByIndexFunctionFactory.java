package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class GetByIndexFunctionFactory implements FunctionFactory {
private GetByIndexFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new GetByIndexFunction();
		
		return function;
	}

	private class GetByIndexFunction implements Function {

		public String getURI() {
			return "getByIndex";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			List<String> list = new ArrayList<String>();
			Integer index = Integer.parseInt(arguments.get(1).get(0));
			List<String> argList = arguments.get(0);
			
			list.add(argList.get(index));
			
			return list;
		}	
	}
}
