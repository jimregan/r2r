package de.fuberlin.wiwiss.r2r;

/*
 * A Triple of a TargetPattern 
 */
public class Triple {
	private TripleElement subject;
	private TripleElement verb;
	private TripleElement object;
	private String propertyURI;
	private String classURI;
	
	public Triple(TripleElement subject, TripleElement verb,
			TripleElement object, String propertyURI, String classURI) {
		super();
		this.subject = subject;
		this.verb = verb;
		this.object = object;
		this.propertyURI = propertyURI;
		this.classURI = classURI;
	}

	public String getPropertyURI() {
		return propertyURI;
	}

	public String getClassURI() {
		return classURI;
	}

	public TripleElement getSubject() {
		return subject;
	}

	public TripleElement getVerb() {
		return verb;
	}

	public TripleElement getObject() {
		return object;
	}
	
	
}
