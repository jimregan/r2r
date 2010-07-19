package de.fuberlin.wiwiss.r2r;

import java.util.List;

public interface SourceManager {
	/**
	 * Get all the current source descriptions of the source manager
	 * @return List of source descriptions
	 */
	public List<SourceDescription> getSourceDescriptions();
	
	/**
	 * Instantiate a Source object given the source description
	 * @param sd
	 * @return
	 */
	public Source getSourceObjectForSourceDescription(SourceDescription sd);
}
