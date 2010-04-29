package de.fuberlin.wiwiss.r2r;

import java.util.Collection;
import java.util.List;

public interface MetadataRepository {
	/**
	 * Get all the mapping URIs (packaged in MappingsInfo objects) from the meta data repository that generate one or more of the given entities
	 * @param entityUris
	 * @return
	 */
	public List<MappingsInfo> getMappingURIsForVocabularyDefinition(List<String> entityUris);
	
	/**
	 * Get all the mapping URIs from the meta data repository that generate one or more of the given entities.
	 * All the mappings are being restricted by the first argument.
	 * @param contextEntityUri the class restriction. Only instances that qualify are mapped.
	 * @param propertyUris the target properties of the mapped instances.
	 * @param addClassRestrictionMappings is true if mappings of the class restriction should be added. Else these mappings only act as restrictions not as triple generating mappings.
	 * @return MappingsInfo objects that contain information about which mappings and how they should be executed.
	 */
	public List<MappingsInfo> getMappingURIsForVocabularyDefinition(String contextEntityUri, Collection<String> propertyUris, boolean addClassRestrictionMappings);
}
