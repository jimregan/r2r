package de.fuberlin.wiwiss.r2r;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Model;

/*
 * Stores variable results taken from the query and also the ones calculated by the transformations.
 */
public class VariableResults {
	private Map<String, List<String>> variableValues;
	private QuerySolution querySolution;
	private Map<String, Resource> blankNodes = null;
	private long time;
	
	VariableResults(QuerySolution qs) {
		variableValues = new HashMap<String, List<String>>();
		this.querySolution = qs;
		time = System.nanoTime();
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
	
	public Resource getBlankNodeResource(String identifier, Model model) {
		if(blankNodes==null)
			blankNodes = new HashMap<String, Resource>();
		
		// If no identifier is given, always create a new blank node
		if(identifier==null)
			return model.createResource();
		
		// For equivalent identifiers return equivalent blank nodes
		if(blankNodes.containsKey(identifier))
			return blankNodes.get(identifier);
		else {
			Resource blankNode = model.createResource();
			blankNodes.put(identifier, blankNode);
			return blankNode;
		}
	}
}
