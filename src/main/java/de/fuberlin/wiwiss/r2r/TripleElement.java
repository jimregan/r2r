package de.fuberlin.wiwiss.r2r;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
 * This class stores the type and value of an element (subject, predicate or object) of a triple.
 */
public class TripleElement {
	private Type type;
	private List<String> values;
	
	public enum Type {
		IRI, VARIABLE, IRIVARIABLE, BOOLEAN, STRING, STRINGVARIABLE, LANGTAGSTRING, LANGTAGVARIABLE, DATATYPESTRING, DATATYPEVARIABLE, INTEGER, DOUBLE, DECIMAL, BLANKNODE
	}
	
	public TripleElement(Type type, String... values) {
		this.type = type;
		this.values = new ArrayList<String>();
		if(values!=null) {
			for(String value: values)
				this.values.add(value);
		}
		else
			this.values.add(null);
	}
	
	public Type getType() {
		return type;
	}

	public String getValue(int index) {
		return values.get(index);
	}
	
	public List<String> getValues() {
		return Collections.unmodifiableList(values);
	}
}
