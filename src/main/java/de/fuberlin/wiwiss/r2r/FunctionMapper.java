package de.fuberlin.wiwiss.r2r;

import java.util.Map;
import java.util.HashMap;

/*
 * FunctionMapping objects handle information concerning function name to function URI mapping.
 */
public class FunctionMapper {
	Map<String, String> mappings = new HashMap<String, String>();
	
	public void setMapping(String functionName, String functionURI) {
		mappings.put(functionName, functionURI);
	}
	
	public String getFunctionUri(String functionName) {
		if(mappings.get(functionName)==null)
			return functionName;
		else
			return mappings.get(functionName);
	}
}
