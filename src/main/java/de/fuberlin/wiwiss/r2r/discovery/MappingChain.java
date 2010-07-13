package de.fuberlin.wiwiss.r2r.discovery;

import java.util.Map;
import java.util.HashMap;
import de.fuberlin.wiwiss.r2r.*;
import com.hp.hpl.jena.rdf.model.*;

public class MappingChain {
	private Map<String, MappingChain> mappingDependencies;
	// The boolean for sourceDependency stores if the dependency is a property
	private Map<String, Boolean> sourceDependencies;
	private String mappingURI;
	private int depth;
	private double score;

	private String targetVocabularyTerm;
	public MappingChain(String mapping, String targetVocabularyTerm, int depth, double score) {
		super();
		this.mappingURI = mapping;
		this.targetVocabularyTerm = targetVocabularyTerm;
		this.mappingDependencies = new HashMap<String, MappingChain>();
		this.sourceDependencies = new HashMap<String, Boolean>();
		this.depth = depth;
		this.score = score;
	}
	public Map<String, MappingChain> getMappingDependencies() {
		return mappingDependencies;
	}
	public String getMappingURI() {
		return mappingURI;
	}
	
	public int getDepth() {
		return depth;
	}
	public double getScore() {
		return score;
	}

	public String getTargetVocabularyTerm() {
		return targetVocabularyTerm;
	}
	
	public void setMappingDependency(String targetVocabularyElement, MappingChain mappingChain) {
		mappingDependencies.put(targetVocabularyElement, mappingChain);
	}
	
	public void setSourceDependency(String targetVocabularyElement, boolean isClass) {
		sourceDependencies.put(targetVocabularyElement, isClass);
	}
	
	public long execute(Source in, Output out, MappingRepository repository) {
		long count = executeMappingRecursively(in, out, repository);
		return count;
	}
	
	private long executeMappingRecursively(Source in, Output outputModel, MappingRepository repository) {
		// If only source dependencies exist, execute mapping directly
		Mapping mapping = repository.getMappingOfUri(this.mappingURI);
		if(mappingDependencies.size()==0)
			return mapping.executeMapping(in, outputModel);
		
		Model inputModel = ModelFactory.createDefaultModel();
		for(Map.Entry<String, Boolean> sourceDep: sourceDependencies.entrySet()) {
			if(sourceDep.getValue())
				getPropertyStatements(sourceDep.getKey(), in, inputModel);
			else
				getClassStatements(sourceDep.getKey(), in, inputModel);
		}
		
		long count = inputModel.size();
		
		Output inputOutput = new JenaModelOutput(inputModel);
		for(Map.Entry<String, MappingChain> mappingDep: mappingDependencies.entrySet()) {
			count += mappingDep.getValue().executeMappingRecursively(in, inputOutput, repository);
		}
		
		Source inputModelSource = new JenaModelSource(inputModel);
		count += mapping.executeMapping(inputModelSource, outputModel);
		
		return count;
	}
	
	private void getPropertyStatements(String property, Source in, Model out) {
		StringBuilder sb = new StringBuilder();
		sb.append("CONSTRUCT { ?s <").append(property).append("> ?o } WHERE { ?s <");
		sb.append(property).append("> ?o }");
		out.add(in.executeConstructQuery(sb.toString()));
	}
	
	private void getClassStatements(String classURI, Source in, Model out) {
		StringBuilder sb = new StringBuilder();
		sb.append("CONSTRUCT { ?s a <").append(classURI).append("> } WHERE { ?s a <");
		sb.append(classURI).append("> }");
		out.add(in.executeConstructQuery(sb.toString()));
	}
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		String indent = "";
		for(int i=0;i<depth;i++)
			indent+="  ";
		output.append(indent).append("-").append(targetVocabularyTerm).append("\n");
		for(String sd: sourceDependencies.keySet())
			output.append(indent).append(" * ").append(sd).append("\n");
		for(MappingChain md: mappingDependencies.values()) {
			output.append(md);
		}
		return output.toString();
	}
}
