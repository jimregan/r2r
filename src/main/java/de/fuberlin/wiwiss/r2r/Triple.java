package de.fuberlin.wiwiss.r2r;

/*
 * A Triple of a TargetPattern 
 */
public class Triple {
	TripleElement subject;
	TripleElement verb;
	TripleElement object;
	
	public Triple(TripleElement subject, TripleElement verb,
			TripleElement object) {
		super();
		this.subject = subject;
		this.verb = verb;
		this.object = object;
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
