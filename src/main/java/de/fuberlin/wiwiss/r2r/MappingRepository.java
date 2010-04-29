package de.fuberlin.wiwiss.r2r;

import java.util.Map;

public interface MappingRepository {
	/**
	 * Create a mapping object by the repository.
	 * @param mappingURI the URI that identifies the mapping
	 * @return the mapping object
	 */
	public Mapping getMappingOfUri(String mappingURI);
	
	/**
	 * creates a Map of URI -> Mapping object pairs
	 * @return URI -> Mapping Map
	 */
	public Map<String, Mapping> getMappings();
	
	/**
	 * Create a Meta Data Repository from the mappings of this repository
	 * @return a Meta Data Repository
	 */
	public MetadataRepository getMetaDataRepository();
}
