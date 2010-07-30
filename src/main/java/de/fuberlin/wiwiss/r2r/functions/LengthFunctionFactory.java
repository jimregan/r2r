package de.fuberlin.wiwiss.r2r.functions;

import java.util.ArrayList;
import java.util.List;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;

public class LengthFunctionFactory implements FunctionFactory {
	private Function function = null;
		
		public Function getInstance() {
			if(function==null)
				function = new LengthFunction();
			
			return function;
		}

		private static class LengthFunction implements Function {

			public String getURI() {
				return "length";
			}
			
			public List<String> execute(List<List<String>> arguments, String hint) {
				if(arguments.size()<1)
					throw new IllegalArgumentException("length(): No argument supplied!");
				
				List<String> arg = arguments.get(0);
				List<String> result = new ArrayList<String>();
				result.add("" + arg.size());
				
				return result;
			}
		}
	}
