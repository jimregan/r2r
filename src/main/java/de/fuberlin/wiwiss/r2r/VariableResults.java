package de.fuberlin.wiwiss.r2r;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.rdf.model.RDFNode;

/*
 * Stores variable results taken from the query and also the ones calculated by the transformations.
 */
public class VariableResults {
	private Map<String, List<String>> variableValues;
	private QuerySolution querySolution;
	
	VariableResults(QuerySolution qs) {
		variableValues = new HashMap<String, List<String>>();
		this.querySolution = qs;
	}
	
	public boolean addVariableResult(String varName, List<String> results) {
		if(variableValues.get(varName)==null) {
			variableValues.put(varName, results);
			return true;
		}
		return false;
	}
	
	public RDFNode getRDFNode(String variable) {
		return querySolution.get(variable);
	}
	
	public List<String> getResults(String varName) {
		return variableValues.get(varName);
	}
}
