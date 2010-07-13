package de.fuberlin.wiwiss.r2r.discovery;

import java.util.HashSet;
import java.util.Set;

public class TargetMappingCluster {
	protected double currentBestScore = 0.0;
	protected String currentBestMapping = null;
	protected Set<String> dependendMappings;
	public Set<String> getDependendMappings() {
		return dependendMappings;
	}

	protected String datasetURI;
	protected String vocabElementURI;
	
	public TargetMappingCluster(String vocabElementURI, String datasetURI) {
		this.datasetURI = datasetURI;
		this.vocabElementURI = vocabElementURI;
		dependendMappings = new HashSet<String>();
	}
	
	@Override
	public int hashCode() {
		return vocabElementURI.hashCode() + (datasetURI==null ? 0 : datasetURI.hashCode());
	}
	
	@Override
	public boolean equals(Object object) {
		if(object instanceof TargetMappingCluster) {
			TargetMappingCluster mc = (TargetMappingCluster) object;
			if(!vocabElementURI.equals(mc.vocabElementURI))
				return false;
			else {
				if(datasetURI!=null && mc.datasetURI!=null)
					return datasetURI.equals(mc.datasetURI);
				else if(datasetURI==mc.datasetURI) // both null
					return true;
				else
					return false; // one null, one objects
			}
		}
		else
			return false;
	}
	
	public void addDependendMapping(String mapping) {
		dependendMappings.add(mapping);
	}
	
	@Override
	public String toString() {
		return vocabElementURI + datasetURI;
	}
	
	/**
	 * 
	 * @param mapping mapping URI
	 * @param mappingScore score between 0 and 1
	 * @return true if the mapping is the new best mapping for this cluster
	 */
	public boolean updateMapping(String mapping, double mappingScore) {
		if(mappingScore > currentBestScore) {
			currentBestScore = mappingScore;
			currentBestMapping = mapping;
			return true;
		}
		return false;
	}

	public double getCurrentBestScore() {
		return currentBestScore;
	}

	public String getCurrentBestMapping() {
		return currentBestMapping;
	}
}
