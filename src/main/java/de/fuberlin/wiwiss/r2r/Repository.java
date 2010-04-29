package de.fuberlin.wiwiss.r2r;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.shared.NotFoundException;
import com.hp.hpl.jena.vocabulary.OWL;
import com.hp.hpl.jena.vocabulary.RDF;
import com.hp.hpl.jena.vocabulary.RDFS;

/**
 * A Repository offers access to R2R mappings and functions to import non-R2R mappings. 
 * @author andreas
 *
 */
public class Repository implements MappingRepository, MetadataRepository, Source {
	private Source source;
	private static Log log = LogFactory.getLog(Repository.class);
	
	/**
	 * Create a Repository from a Source object
	 * @param source A Source object
	 */
	public Repository(Source source) {
		this.source = source;
	};
	
	//Factory methods:

	
	/**
	 * create a repository based on a Jena model
	 * @param model a Jena Model
	 * @return Repository
	 */
	public static Repository createJenaModelRepository(Model model) {
		return new Repository(new JenaModelSource(model));
	}
	
	/**
	 * Create a repository created from a file or URI
	 * @param fileOrUri a path to a file in the file system or a URI
	 * @return Repository
	 */
	public static Repository createFileOrUriRepository(String fileOrUri) throws NotFoundException {
		return new Repository(new FileOrURISource(fileOrUri));
	}
	
	/**
	 * Create a repository that can be queried over a SPARQL endpoint
	 * @param endpointURI The SPARQL endpoint URL String
	 * @return Repository
	 */
	public static Repository createSparqlEndpointRepository(String endpointURI) {
		return new Repository(new SparqlEndpointSource(endpointURI));
	}
	
	/**
	 * Create a repository that can be queried over a SPARQL endpoint
	 * @param endpointURI The SPARQL endpoint URL String
	 * @param defaultGraph The default graph to query
	 * @return Repository
	 */
	public static Repository createSparqlEndpointRepository(String endpointURI, String defaultGraph) {
		return new Repository(new SparqlEndpointSource(endpointURI, defaultGraph));
	}
	
	/**
	 * Create a repository that can be queried over a SPARQL endpoint
	 * @param endpointURI The SPARQL endpoint URL String
	 * @param defaultGraph The default graph to query
	 * @param namedGraphURIs A list of named graphs against the query will be executed
	 * @return Repository
	 */
	public static Repository createSparqlEndpointRepository(String endpointURI, String defaultGraph, List<String> namedGraphURIs) {
		return new Repository(new SparqlEndpointSource(endpointURI, defaultGraph, namedGraphURIs));
	}
	
	/**
	 * fetch _all_ mappings from the repository
	 * @return Java Map: mapping URI String -> Mapping object
	 */
	public Map<String, Mapping> getMappings() {
		Map<String, Mapping> mappings = new HashMap<String, Mapping>();
		List<String> resources = getMappingResources(); 

		for(String resURI: resources) {
			Mapping mapping = getMappingOfUri(resURI);
			if(mapping!=null)
				mappings.put(mapping.getUri(), mapping);
		}
		return mappings;
	}
	
	/**
	 * create a Repository object that includes the meta data of this Repository 
	 * @return Mapping meta-data Repository
	 */
	public MetadataRepository getMetaDataRepository() {
		Model resModel = ModelFactory.createDefaultModel(); 
		List<String> resources = getMappingResources(); 

		for(String resURI: resources) {
			Mapping mapping = getMappingOfUri(resURI);
			if(mapping!=null)
				resModel.add(mapping.getJenaModelWithMappingMetaData());
		}
		Repository repository = new Repository(new JenaModelSource(resModel));
		return repository;
	}

	private List<String> listMappingResourcesFromResultSet(ResultSet resultSet) {
		List<String> resources = new ArrayList<String>();
		while(resultSet.hasNext())
			resources.add(resultSet.next().get("s").toString());
		
		return resources;
	}
	
	private List<String> getMappingResources() {
		String query = "select distinct ?s where { ?s <" + R2R.targetPattern + "> ?o }";
		return listMappingResourcesFromResultSet(source.executeSelectQuery(query));
	}
	
	private List<String> getPropertyValues(ResultSet resultSet) {
		List<String> values = new ArrayList<String>();

		while(resultSet.hasNext()) {
			RDFNode node = resultSet.next().get("o");
			if(node instanceof Literal)
				values.add(((Literal) node).getLexicalForm());
			else
				values.add(node.toString());
		}
		return values;
	}
	
	private String getPropertyValuesQuery(String property, String resourceURI) {
		return "select distinct ?o where { <" + resourceURI + "> <" + property + "> ?o }";
	}
	
	/**
	 * fetches a Mapping out of the Repository
	 * @param mappingURI the mapping URI String
	 * @return a Mapping object corresponding to the supplied mapping URI or null 
	 */
	public Mapping getMappingOfUri(String mappingURI) {
		List<String> mappingTypes = getPropertyValuesForResource(mappingURI, RDF.type.getURI());
		if(mappingTypes.size()==0)
			throw new RuntimeException("Unknown mapping type of resource <" + mappingURI + ">");
		boolean isClassMapping = isClassMappingType(mappingTypes);
		
		List<String> sp = getPropertyValuesForResource(mappingURI, R2R.sourcePattern);
		if(sp.size()!=1) {
			if(log.isDebugEnabled())
				log.debug("Mapping <" + mappingURI + "> has no unique source pattern");
			return null;
		}
		String sourcePattern = sp.get(0);
		List<String> targetPatterns = getPropertyValuesForResource(mappingURI, R2R.targetPattern);
		List<String> transformations = getPropertyValuesForResource(mappingURI, R2R.transformation);
		List<String> prefixDefinitions = getPropertyValuesForResource(mappingURI, R2R.prefixDefinitions);
		
		String classRef = getReferencedClassMappingUri(mappingURI);
		
		if(classRef==null)
			return Mapping.createMapping(mappingURI, null, prefixDefinitions, targetPatterns, transformations, sourcePattern, isClassMapping);
		
		String parentMapping = classRef;
		List<String> sourcePatterns = new ArrayList<String>();
		sourcePatterns.add(sourcePattern);
		while(classRef!=null) {//TODO: Add acyclic check
			MappingData mapData = getMappingDataOfUri(classRef);
			if(mapData==null)
				return null;
			sourcePatterns.add(mapData.sourcePattern);
			prefixDefinitions. addAll(mapData.prefixDefinitions);
			classRef = getReferencedClassMappingUri(classRef);
		}
		return Mapping.createMapping(mappingURI, parentMapping, prefixDefinitions, targetPatterns, transformations, sourcePatterns, isClassMapping);
	}
	
	private MappingData getMappingDataOfUri(String mappingURI) {
		List<String> sp = getPropertyValuesForResource(mappingURI, R2R.sourcePattern);
		if(sp.size()!=1) {
			if(log.isDebugEnabled())
				log.debug("Mapping <" + mappingURI + "> has no unique source pattern");
			return null;
		}
		String sourcePattern = sp.get(0);
		List<String> targetPatterns = getPropertyValuesForResource(mappingURI, R2R.targetPattern);
		if(targetPatterns.size()==0) {
			if(log.isDebugEnabled())
				log.debug("Mapping <" + mappingURI + "> has no target pattern");
			return null;
		}
		List<String> transformations = getPropertyValuesForResource(mappingURI, R2R.transformation);
		List<String> prefixDefinitions = getPropertyValuesForResource(mappingURI, R2R.prefixDefinitions);

		return new MappingData(sourcePattern, targetPatterns, transformations, prefixDefinitions);
	}
	
	private List<String> getPropertyValuesForResource(String resourceURI, String property) {
		return getPropertyValues(source.executeSelectQuery(getPropertyValuesQuery(property, resourceURI)));
	}
	
	//Check if the type of the resource is a class mapping
	private boolean isClassMappingType(List<String> types) {
		for(String type: types) {
			if(type.equals(R2R.ClassMapping))
				return true;
		}
		return false;
	}
	
	private String getReferencedClassMappingUri(String mappingUri) {
		ResultSet resultSet = source.executeSelectQuery(getReferencedClassMappingUriQuery(mappingUri));
		if(resultSet.hasNext())
			return resultSet.next().get("classref").toString();
		else
			return null;
	}
	
	private String getReferencedClassMappingUriQuery(String mappingUri) {
		return "Select ?classref where { <" + mappingUri + "> <" + R2R.classMappingRef + "> ?classref }"; 
	}
	
	private class MappingData {
		String sourcePattern;
		List<String> targetPatterns;
		List<String> transformations;
		List<String> prefixDefinitions;
		
		public MappingData(String sourcePattern, List<String> targetPatterns,
				List<String> transformations, List<String> prefixDefinitions) {
			super();
			this.sourcePattern = sourcePattern;
			this.targetPatterns = targetPatterns;
			this.transformations = transformations;
			this.prefixDefinitions = prefixDefinitions;
		}
	}
	
	/*
	 * Get all the mapping URIs from the meta data repository that generate one or more of the given entities
	 */
	public List<MappingsInfo> getMappingURIsForVocabularyDefinition(List<String> entityUris) {
		return getMappingURIsForVocabularyDefinition(null, entityUris, false);
	}

	//TODO: Add another function or replace this function and offer a better interface, rework semantics of the return objects
	/**
	 * Get all the mapping URIs from the meta data repository that generate one or more of the given entities.
	 * All the mappings are being put into a specific context defined by the first argument.
	 * @param contextEntityUri
	 * @param propertiesUris
	 * @param addClassRestrictionMappings
	 * @return MappingsInfo objects that contain information about which and how mappings should be executed.
	 */
	public List<MappingsInfo> getMappingURIsForVocabularyDefinition(String contextEntityUri, Collection<String> propertiesUris, boolean addClassRestrictionMappings) {
		List<MappingsInfo> mappingInfos = new ArrayList<MappingsInfo>();
		boolean forwardChaining = Config.getProperty("de.fuberlin.wiwiss.r2r.ForwardChaining","false").equals("true"); 
		
		Set<String> classmappings = null;
		if(contextEntityUri!=null) 
			classmappings = findMappingsForTargetEntity(contextEntityUri);
		else {
			classmappings = new HashSet<String>();
			classmappings.add("");
		}
		
		Map<String, Set<String>> mappingsPerClassMapping = new HashMap<String, Set<String>>();
		Map<String, Map<String, Collection<String>>> restrictionsPerClassMapping = new HashMap<String, Map<String, Collection<String>>>();
		
		// This will only be executed if the class restriction mappings should be added 
		Set<String> classMappingsPlusParents = null;
		if(contextEntityUri!=null) {
			//All class/context mappings, property mappings on this level can be associated with
			classMappingsPlusParents = new HashSet<String>();
			classMappingsPlusParents.addAll(classmappings);
			
			for(String c: classmappings) {
				Set<String> parents = findAllParentMappingsOfMapping(c);
				classMappingsPlusParents.addAll(parents);
				if(addClassRestrictionMappings) {
					addMappingsToClassMappingContext(c, c, mappingsPerClassMapping);
					addRestrictionToClassMappingContext(c, contextEntityUri, c, restrictionsPerClassMapping);
				}
				// Add parent mappings of class/property mapping if forward chaining is active, by default it's not
				// Also these are only added if mappings of the class restriction entity are wanted
				if(forwardChaining && addClassRestrictionMappings)
					for(String parent: parents)
						addMappingsToClassMappingContext(parent, c, mappingsPerClassMapping);
			}
		}
		
		//Add Property/Other Mappings
		for(String propertyUri: propertiesUris) {
			Set<String> potentialPropertyMappings = findMappingsForTargetEntity(propertyUri);
			
			if(contextEntityUri!=null) {
				//Add all property mappings that are associated with class mapping and its parent classes
				List<String> propertyMappings = findMappingsForTargetPropertyInClassContext(potentialPropertyMappings, classMappingsPlusParents);
				for(String p: propertyMappings) {
					for(String c: classmappings) {
						addRestrictionToClassMappingContext(p, propertyUri, c, restrictionsPerClassMapping);
						addMappingsToClassMappingContext(p, c, mappingsPerClassMapping);
					}
				}
				potentialPropertyMappings.removeAll(propertyMappings);
			}
			
			
			for(String potMapping: potentialPropertyMappings) {
				//Check if there is a property mapping associated with a descendant of the class mapping
				List<String> cl = null;
				if(contextEntityUri!=null) {
					cl = getClassMappingChainForPropertyMapping(potMapping, classmappings);
				}
				
				if(cl!=null) {//Then the property mapping should be executed as it is				
					Set<String> prop = new HashSet<String>();
					prop.add(potMapping);
					mappingInfos.add(new MappingsInfo(prop, prop, createRestriction(potMapping, propertyUri)));
				}
				else {//Else execute the property mapping and its class mappings in the context of the prop mapping and every mapping of "classUri"
//					Set<String> clm = findAllParentMappingsOfClassMapping(potMapping);
//					if(clm.size()>0) {
						if(contextEntityUri!=null)
							for(String c: classmappings) {
//								Collection<String> contextcl = new ArrayList<String>();
//								contextcl.add(c);
//								contextcl.add(potMapping);
//								mappingInfos.add(new MappingsInfo(contextcl, clm));
								addRestrictionToClassMappingContext(potMapping, propertyUri, c, restrictionsPerClassMapping);
								addMappingsToClassMappingContext(potMapping, c, mappingsPerClassMapping);
							}
						else {
							Collection<String> contextcl = new ArrayList<String>();
							contextcl.add(potMapping);
//							clm.add(potMapping);
							mappingInfos.add(new MappingsInfo(contextcl, contextcl, createRestriction(potMapping, propertyUri)));
						}
//					}
				}
			}
		}
		
		if(contextEntityUri!=null)
			for(String c: classmappings) {
				Set<String> m = mappingsPerClassMapping.get(c);
				if(m==null)
					continue;
				if(contextEntityUri==null)
					break;
				Map<String, Collection<String>> r = restrictionsPerClassMapping.get(c);
				Collection<String> context = new ArrayList<String>();
				context.add(c);
				mappingInfos.add(new MappingsInfo(context, m, r));
			}
		
		return mappingInfos;
	}
	
	private void addMappingsToClassMappingContext(String mapping, String classMapping, Map<String, Set<String>> mappingsPerClassMapping) {
		assert(mappingsPerClassMapping.containsKey(classMapping));
		Set<String> mappings = mappingsPerClassMapping.get(classMapping);
		if(mappings==null) {
			mappings = new HashSet<String>();
		}
		mappings.add(mapping);
		mappingsPerClassMapping.put(classMapping, mappings);
	}
	
	private void addRestrictionToClassMappingContext(String propMapping, String property, String classMapping, Map<String, Map<String, Collection<String>>> restrictionsOfClassContexts) {
		assert(restrictionsOfClassContexts.containsKey(classMapping));
		Map<String, Collection<String>> restrictions = restrictionsOfClassContexts.get(classMapping);
		if(restrictions==null) {
			restrictions = new HashMap<String, Collection<String>>();
			restrictionsOfClassContexts.put(classMapping, restrictions);
		}
		Collection<String> properties = restrictions.get(propMapping);
		if(properties==null) {
			properties = new HashSet<String>();
			restrictions.put(propMapping, properties);
		}
		properties.add(property);
	}
	
	private Map<String, Collection<String>> createRestriction(String mappingUri, String propertyUri) {
		Map<String, Collection<String>> m = new HashMap<String, Collection<String>>();
		addRestrictionToMap(mappingUri, propertyUri, m);
		return m;
	}
	
	private void addRestrictionToMap(String mappingUri, String propertyUri, Map<String, Collection<String>> resMap) {
		Collection<String> restrictions = resMap.get(mappingUri);
		if(restrictions==null) {
			restrictions = new HashSet<String>();
			resMap.put(mappingUri, restrictions);
		}
		restrictions.add(propertyUri);
	}
	
	/*
	 * Fetches all class mappings from the repository where classUri is the target class
	 */
	private Set<String> findMappingsForTargetEntity(String entityUri) {
		String query = "Select ?mapping where { ?mapping <" + R2R.mapsTo + "> <" + entityUri + "> }";
		ResultSet resultset = source.executeSelectQuery(query);
		Set<String> mappings = new HashSet<String>();
		while(resultset.hasNext()) {
			mappings.add(resultset.next().get("mapping").toString());
		}
		return mappings;
	}
	
	/*
	 * Fetches all parent mappings of the specified mapping
	 */
	private Set<String> findAllParentMappingsOfMapping(String mappingUri) {
		Set<String> parentMappings = new HashSet<String>();
		String currentMapping = mappingUri;
		
		while(currentMapping!=null) {
			String query = "Select ?mapping where { <" + currentMapping + "> <" + R2R.classMappingRef + "> ?mapping }";
			ResultSet rs = source.executeSelectQuery(query);
			if(!rs.hasNext())
				return parentMappings;
			else {
				currentMapping = rs.next().get("mapping").toString();
				parentMappings.add(currentMapping);
			}
		}
		return parentMappings;
	}
	

	/*
	 * Returns the property mappings that are defined in one of the given class mappings
	 */
	private List<String> findMappingsForTargetPropertyInClassContext(Set<String> potentialMappings, Set<String> classMappings) {
		List<String> propertyMappings = new ArrayList<String>();
		for(String potMap: potentialMappings) {
			if(checkForMappingContainment(potMap, classMappings))
				propertyMappings.add(potMap);
		}
		return propertyMappings;
	}
	
	/*
	 * Checks if the property mapping is associated with one of the class mappings or a subclass of one of them.
	 */
//	private boolean checkForMappingContainment(String propertyMapping, Set<String> classMappings) {
//		String currentMapping = propertyMapping;
//		
//		while(currentMapping!=null) {
//			String query = "Select ?mapping where { <" + currentMapping + "> <" + R2R.classMappingRef + "> ?mapping }";
//			ResultSet rs = source.executeSelectQuery(query);
//			if(!rs.hasNext())
//				return false;
//			else {
//				currentMapping = rs.next().get("mapping").toString();
//				if(classMappings.contains(currentMapping))
//					return true;
//			}
//		}
//		return false;
//	}
	
	/*
	 * Returns the mapping URIs that lead to one of the class mappings of the second argument
	 * else it returns null
	 */
	private List<String> getClassMappingChainForPropertyMapping(String propertyMapping, Set<String> classMappings) {
		String currentMapping = propertyMapping;
		List<String> mappings = new ArrayList<String>();
	
		while(currentMapping!=null) {
			String query = "Select ?mapping where { <" + currentMapping + "> <" + R2R.classMappingRef + "> ?mapping }";
			ResultSet rs = source.executeSelectQuery(query);
			if(!rs.hasNext())
				return null;
			else {
				currentMapping = rs.next().get("mapping").toString();

				if(classMappings.contains(currentMapping)) {//TODO acyclic check
					return mappings;
				}
				mappings.add(currentMapping);
			}
		}
		return null;
	}

	
	/*
	 * Checks if the property mapping is associated with one of the given class mappings
	 */
	private boolean checkForMappingContainment(String propertyMapping, Set<String> classMappings) {
		String query = "Select ?mapping where { <" + propertyMapping + "> <" + R2R.classMappingRef + "> ?mapping }";
		ResultSet rs = source.executeSelectQuery(query);
		if(rs.hasNext()) {
			String classMapping = rs.next().get("mapping").toString();
			if(classMappings.contains(classMapping))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public ResultSet executeSelectQuery(String query) {
		return source.executeSelectQuery(query);
	}

	public Model executeDescribeQuery(String query) {
		return source.executeDescribeQuery(query);
	}
	
	/**
	 * reads in all mapping data found in a Source object. Also converts simple OWL and RDFS mappings into R2R format
	 * @param source Source object containing mapping information
	 * @return Jena Model with the imported, possibly converted mappings
	 */
	public static Model importMappingDataFromSource(Source source, StringGenerator uriGenerator) {
		Model outputModel = ModelFactory.createDefaultModel();
		importMappingDataFromSourceIntoModel(source, outputModel, uriGenerator);
		return outputModel;
	}
	
	public static Model importMappingDataFromFile(String filename, StringGenerator uriGenerator) {
		Source source = new FileOrURISource(filename);
		return importMappingDataFromSource(source, uriGenerator);
	}
	
	/**
	 * write mapping data from Source object into the given Jena Model
	 * @param source Source object
	 * @param outputModel Jena model to output the imported (and possibly converted) mapping data
	 */
	public static void importMappingDataFromSourceIntoModel(Source source, Model outputModel, StringGenerator uriGenerator) {
		copyR2RmappingData(source, outputModel);
		importRDFSMappingData(source, outputModel, uriGenerator);
		importOWLMappingData(source, outputModel, uriGenerator);
	}
	
	private static void copyR2RmappingData(Source source, Model outputModel) {
		String query = "CONSTRUCT { ?s ?p ?o }" + 
				"WHERE {" +
				"?s <" + R2R.sourcePattern + "> ?st ." +
				"?s ?p ?o ." +
				"}";
		outputModel.add(source.executeConstructQuery(query));
	}
	
	/**
	 * imports rdfs:subClassOf and rdfs:subPropertyOf mappings from the Source
	 * @param source the Source of the RDFS mappings
	 * @param outputModel where the converted mappings are written to
	 * @param uriGenerator URIs for the converted mappings are taken from the URIGenerator
	 */
	public static void importRDFSMappingData(Source source, Model outputModel, StringGenerator uriGenerator) {
		importAndConvertSubClassOfMappings(source, outputModel, uriGenerator);
		importAndConvertSubPropertyOfMappings(source, outputModel, uriGenerator);
	}
	
	/**
	 * imports owl:equivalentClass and owl:equivalentProperty mappings from the Source
	 * @param source the Source of the OWL mappings
	 * @param outputModel where the converted mappings are written to
	 * @param uriGenerator URIs for the converted mappings are taken from the URIGenerator
	 */
	public static void importOWLMappingData(Source source, Model outputModel, StringGenerator uriGenerator) {
		importAndConvertEquivalentClassMappings(source, outputModel, uriGenerator);
		importAndConvertEquivalentPropertyMappings(source, outputModel, uriGenerator);
	}
	
	private static void importAndConvertEquivalentPropertyMappings(Source source, Model outputModel, StringGenerator uriGenerator) {
		String query = "Select ?e1 ?e2 WHERE {" +
			"?e1 <" + OWL.equivalentProperty.getURI() + "> ?e2" +
			"}";
		ResultSet rs = source.executeSelectQuery(query);
		while(rs.hasNext()) {
			QuerySolution qs = rs.next();
			RDFNode e1 = qs.get("e1");
			RDFNode e2 = qs.get("e2");
			if(e1.isURIResource() && e2.isURIResource()) {
				String uri = uriGenerator.nextString();
				String e1Pattern = "?SUBJ <" + e1.toString() + "> ?o";
				String e2Pattern = "?SUBJ <" + e2.toString() + "> ?o";
				addR2RMapping(uri, e1Pattern, e2Pattern, R2R.PropertyMapping, outputModel);
				uri = uriGenerator.nextString();
				addR2RMapping(uri, e2Pattern, e1Pattern, R2R.PropertyMapping, outputModel);
			}
		}
	}
	
	private static void importAndConvertEquivalentClassMappings(Source source, Model outputModel, StringGenerator uriGenerator) {
		String query = "Select ?e1 ?e2 WHERE {" +
		"?e1 <" + OWL.equivalentClass.getURI() + "> ?e2" +
		"}";
		ResultSet rs = source.executeSelectQuery(query);
		while(rs.hasNext()) {
			QuerySolution qs = rs.next();
			RDFNode e1 = qs.get("e1");
			RDFNode e2 = qs.get("e2");
			if(e1.isURIResource() && e2.isURIResource()) {
				String uri = uriGenerator.nextString();
				String e1Pattern = "?SUBJ a <" + e1.toString() + ">";
				String e2Pattern = "?SUBJ a <" + e2.toString() + ">";
				addR2RMapping(uri, e1Pattern, e2Pattern, R2R.ClassMapping, outputModel);
				uri = uriGenerator.nextString();
				addR2RMapping(uri, e2Pattern, e1Pattern, R2R.ClassMapping, outputModel);
			}
		}
	}
	
	private static void importAndConvertSubClassOfMappings(Source source, Model outputModel, StringGenerator uriGenerator) {
		String query = "Select ?from ?to WHERE {" +
			"?from <" + RDFS.subClassOf.getURI() + "> ?to" +
			"}";
		ResultSet rs = source.executeSelectQuery(query);
		while(rs.hasNext()) {
			QuerySolution qs = rs.next();
			RDFNode from = qs.get("from");
			RDFNode to = qs.get("to");
			if(from.isURIResource() && to.isURIResource()) {
				String uri = uriGenerator.nextString();
				String sourcePattern = "?SUBJ a <" + from.toString() + ">";
				String targetPattern = "?SUBJ a <" + to.toString() + ">";
				addR2RMapping(uri, sourcePattern, targetPattern, R2R.ClassMapping, outputModel);
			}
		}
	}
	
	private static void importAndConvertSubPropertyOfMappings(Source source, Model outputModel, StringGenerator uriGenerator) {
		String query = "Select ?from ?to WHERE {" +
			"?from <" + RDFS.subPropertyOf.getURI() + "> ?to" +
			"}";
		ResultSet rs = source.executeSelectQuery(query);
		while(rs.hasNext()) {
			QuerySolution qs = rs.next();
			RDFNode from = qs.get("from");
			RDFNode to = qs.get("to");
			if(from.isURIResource() && to.isURIResource()) {
				String uri = uriGenerator.nextString();
				String sourcePattern = "?SUBJ <" + from.toString() + "> ?o";
				String targetPattern = "?SUBJ <" + to.toString() + "> ?o";
				addR2RMapping(uri, sourcePattern, targetPattern, R2R.PropertyMapping, outputModel);
			}
		}
	}
	
	private static void addR2RMapping(String uri, String sourcePattern, String targetPattern, String mappingClass, Model outputModel) {
		Resource res = outputModel.getResource(uri);
		res.addProperty(RDF.type, outputModel.createResource(mappingClass));
		res.addProperty(outputModel.createProperty(R2R.sourcePattern), sourcePattern);
		res.addProperty(outputModel.createProperty(R2R.targetPattern), targetPattern);
	}

	public Model executeConstructQuery(String query) {
		return source.executeConstructQuery(query);
	}
}
