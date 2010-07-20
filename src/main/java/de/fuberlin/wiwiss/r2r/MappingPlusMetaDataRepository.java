package de.fuberlin.wiwiss.r2r;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface MappingPlusMetaDataRepository extends MappingRepository,
		MetadataRepository {

	public Mapping getMappingOfUri(String mappingURI);

	public Map<String, Mapping> getMappings();

	public MetadataRepository getMetaDataRepository();

	public Map<String, Set<String>> getMappingMetaData(String mappingURI);

	public List<MappingsInfo> getMappingURIsForVocabularyDefinition(
			List<String> entityUris);

	public List<MappingsInfo> getMappingURIsForVocabularyDefinition(
			String contextEntityUri, Collection<String> propertyUris,
			boolean addClassRestrictionMappings);

	public Set<String> getMappingsOfTargetElement(String elementURI);

}
