package de.fuberlin.wiwiss.r2r;

/**
 * R2R vocabulary
 * @author andreas
 *
 */
public class R2R {
	//r2r namespace
	public final static String R2R = "http://www4.wiwiss.fu-berlin.de/bizer/r2r/";
	
	//r2r class URIs
	public final static String ClassMapping = R2R + "ClassMapping";
	public final static String PropertyMapping = R2R + "PropertyMapping";
	public final static String ExternalFunction = R2R + "ExternalFunction";
	//Composed Function TODO
	
	public final static String sourcePattern = R2R + "sourcePattern";
	public final static String targetPattern = R2R + "targetPattern";
	public final static String classMappingRef = R2R + "classMappingRef";
	public final static String transformation = R2R + "transformation";
	public final static String targetProperty = R2R + "targetEntity";
	public final static String prefixDefinitions = R2R + "prefixDefinitions";
	public final static String mapsTo = R2R + "mapsTo";
	public final static String dependsOn = R2R + "dependsOn";
	public final static String classRestriction = R2R + "classRestriction";
	public final static String classRestrictionAndTarget = R2R + "classRestrictionAndTargetEntity";
	
	// Other Meta Data
	public final static String transformationInvolvedFor = R2R + "transformationInvolvedFor";
	public final static String equivalenceMapping = R2R + "equivalenceMapping";
	public final static String byVocabularyPublisher = R2R + "byVocabularyPublisher";
	public final static String sourceDataset = R2R + "sourceDataset";
	public final static String targetDataset = R2R + "targetDataset";
	//Non-public properties, used internally
//	protected final static String mapsToClass = R2R + "mapsToClass";
//	protected final static String mapsToProperty = R2R + "mapsToProperty";
//	protected final static String dependsOnClass = R2R + "dependsOnClass";
//	protected final static String dependsOnProperty = R2R + "dependsOnProperty";
	//Function Properties:
	public final static String TransformationFunction = R2R + "TransformationFunction";
	public final static String codeLocation = R2R + "codeLocation";
	public final static String qualifiedClassName = R2R + "qualifiedClassName";
	public final static String importFunction = R2R + "importFunction";
	
	
	
}
