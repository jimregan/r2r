package de.fuberlin.wiwiss.r2r.parser;

public class ParseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ParseException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParseException(String message) {
		super(message);
	}
	
}
