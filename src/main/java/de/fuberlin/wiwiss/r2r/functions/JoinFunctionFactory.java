package de.fuberlin.wiwiss.r2r.functions;

import de.fuberlin.wiwiss.r2r.Function;
import de.fuberlin.wiwiss.r2r.FunctionFactory;
import java.util.ArrayList;
import java.util.List;


public class JoinFunctionFactory implements FunctionFactory {
	private JoinFunction function = null;
	
	public Function getInstance() {
		if(function==null)
			function = new JoinFunction();
		
		return function;
	}

	private class JoinFunction implements Function {

		public String getURI() {
			return "infixConcat";
		}
		
		public List<String> execute(List<List<String>> arguments, String hint) {
			StringBuilder concatString = new StringBuilder();
			String infix = arguments.get(0).get(0);
			for(int i=1; i<arguments.size();i++) {
				if(i!=1)
					concatString.append(infix);
				concatString.append(arguments.get(i).get(0));
			}
			ArrayList<String> r = new ArrayList<String>();
			r.add(concatString.toString());
			return r;
		}	
	}
}
