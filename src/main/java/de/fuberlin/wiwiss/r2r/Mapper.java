package de.fuberlin.wiwiss.r2r;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;
import java.util.Map;
import de.fuberlin.wiwiss.r2r.parser.MiniParsers;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Level;
/**
 * The Mapper provides functions for dataset transformation..
 * @author Andreas
 *
 */
public class Mapper {
	private static Log log = LogFactory.getLog(Mapper.class);

	/**
	 * 
	 * maps a source dataset into a target dataset on the basis of the MappingsInfo objects and the concrete mappings objects.
	 * @param source The {@link de.fuberlin.wiwiss.r2r.Source Source} object of the mapping processimpor
	 * @param output The {@link de.fuberlin.wiwiss.r2r.Output Output} target of the mapping process
	 * @param mappingsToExecute The data structure that contains the information of which mappings to execute and how to do that
	 * @param mappings A Map holding the mappings in the form Mapping URI to Mapping object
	 */
	public static void transform(Source source, Output output, List<MappingsInfo> mappingsToExecute, Map<String, Mapping> mappings) {
		for(MappingsInfo mappingsInfo: mappingsToExecute) {
			// Collect the class restriction mappings
			List<Mapping> contextMappings = new ArrayList<Mapping>();
			for(String contextMapping: mappingsInfo.classRestrictionMappings) {
				Mapping mapping = mappings.get(contextMapping);
				if(mapping!=null)				
					contextMappings.add(mapping);
				else
					if(log.isDebugEnabled())
						log.debug("Mapping <" + contextMapping + "> could not be retrieved from the repository!");
			}

			for(String mappingUri: mappingsInfo.allMappings) {
					Mapping mapping = mappings.get(mappingUri);
					if(mapping==null) {
						if(log.isDebugEnabled())
							log.debug("Mapping <" + mappingUri + "> not present!");
						continue;
					}
					Collection<String> restrictions = mappingsInfo.getRestrictions(mappingUri);
					if(restrictions==null)
						mapping.executeMappingInOtherMappingContext(source, output, contextMappings);
					else
						mapping.executeMappingInOtherMappingContext(source, output, contextMappings, restrictions);
			}
		}
	}
	
	/**
	 * maps a source dataset into a target dataset on the basis of the MappingsInfo objects and a repository where the needed mappings are stored.
	 * @param source The {@link de.fuberlin.wiwiss.r2r.Source Source} object of the mapping process
	 * @param output The {@link de.fuberlin.wiwiss.r2r.Output Output} target of the mapping process
	 * @param mappingsToExecute The data structure that contains the information of which mappings to execute and how to do that
	 * @param repository The {@link de.fuberlin.wiwiss.r2r.Repository repository} containing the mappings.
	 */
	public static void transform(Source source, Output output, List<MappingsInfo> mappingsToExecute, MappingRepository repository) {
		SimpleMappingCache mappingCache = new SimpleMappingCache(repository);
		
		for(MappingsInfo mappingsInfo: mappingsToExecute) {
			List<Mapping> contextMappings = new ArrayList<Mapping>();
			for(String contextMapping: mappingsInfo.classRestrictionMappings) {
				Mapping mapping = mappingCache.getMapping(contextMapping);
				if(mapping!=null)
					contextMappings.add(mapping);
				else
					if(log.isDebugEnabled())
						log.debug("Mapping <" + contextMapping + "> could not be retrieved from the repository!");
			}

			for(String mappingUri: mappingsInfo.allMappings) {
					Mapping mapping = mappingCache.getMapping(mappingUri);
					if(mapping==null) {
						if(log.isDebugEnabled())
							log.debug("Mapping <" + mappingUri + "> could not be retrieved from the repository!");
						continue;
					}
					Collection<String> restrictions = mappingsInfo.getRestrictions(mappingUri);
					if(restrictions==null)
						mapping.executeMappingInOtherMappingContext(source, output, contextMappings);
					else
						mapping.executeMappingInOtherMappingContext(source, output, contextMappings, restrictions);
			}
		}
	}
	
	/**
	 * transforms a source dataset into an output dataset. The vocabulary definition must be supplied in imporRDF format.
	 * @param source The {@link de.fuberlin.wiwiss.r2r.Source Source} object of the mapping process
	 * @param output The {@link de.fuberlin.wiwiss.r2r.Output Output} target of the mapping process
	 * @param repository The {@link de.fuberlin.wiwiss.r2r.Repository repository} containing the mappings.
	 * @param vocabSource The {@link de.fuberlin.wiwiss.r2r.Source Source} object containing the vocabulary RDF definition
	 * @param vocabURI The URI of the vocabulary definition
	 */
	public static void transform(Source source, Output output, MappingRepository repository, Source vocabSource, String vocabURI) {
		String query = "Describe <" + vocabURI + ">";
		Model result = vocabSource.executeDescribeQuery(query);
		Collection<TargetVocabulary> vocabs = MiniParsers.parseRDFVocabularyDefinition(result);
		for(TargetVocabulary vocab: vocabs)
			transform(source, output, repository, vocab.getClassRestriction(), vocab.getEntities(), vocab.addMappingOfClassRestriction());
	}
	
	/**
	 * transforms a source dataset into an output dataset. The vocabulary definition must be supplied as R2R vocabulary definition string.
	 * @param source The {@link de.fuberlin.wiwiss.r2r.Source Source} object of the mapping process
	 * @param output The {@link de.fuberlin.wiwiss.r2r.Output Output} target of the mapping process
	 * @param repository The {@link de.fuberlin.wiwiss.r2r.Repository repository} containing the mappings.
	 * @param plainTextVocabularyDefinition The R2R plain text vocabulary definition
	 */
	public static void transform(Source source, Output output, MappingRepository repository, String plainTextVocabularyDefinition) {
		Collection<TargetVocabulary> vocabs = MiniParsers.parsePlainTextVocabularyDefinition(plainTextVocabularyDefinition);
		for(TargetVocabulary vocab: vocabs)
			transform(source, output, repository, vocab.getClassRestriction(), vocab.getEntities(), vocab.addMappingOfClassRestriction());
	}
	
	/**
	 * transforms a source dataset into an output dataset. Pure Java version.
	 * @param source The {@link de.fuberlin.wiwiss.r2r.Source Source} object of the mapping process
	 * @param output The {@link de.fuberlin.wiwiss.r2r.Output Output} target of the mapping process
	 * @param repository The {@link de.fuberlin.wiwiss.r2r.Repository repository} containing the mappings.
	 * @param classRestriction an entity URI to restrict the instance set. This is usually a class URI.
	 * @param entities the target entities of the vocabulary definition.
	 * @param addClassRestrictionMappings set to "true" if the target dataset should contain the entity specified by the classRestriction argument 
	 */
	public static void transform(Source source, Output output, MappingRepository repository, String classRestriction, Collection<String> entities, boolean addClassRestrictionMappings) {
		MetadataRepository metaDataRepository = repository.getMetaDataRepository();
		List<MappingsInfo> mappingsInfos = metaDataRepository.getMappingURIsForVocabularyDefinition(classRestriction, entities, addClassRestrictionMappings);
		transform(source, output, mappingsInfos, repository);
	}
	
	/**
	 * transforms a source dataset into an output dataset. Pure Java version. Without class restriction.
	 * @param source
	 * @param output
	 * @param repository
	 * @param entities
	 */
	public static void transform(Source source, Output output, MappingRepository repository, Collection<String> entities) {
		transform(source,output,repository,null,entities, false);
	}
}
