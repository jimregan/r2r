package de.fuberlin.wiwiss.r2r;

public class FunctionExecutionException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public FunctionExecutionException() {
		super();
	}

	public FunctionExecutionException(String message, Throwable cause) {
		super(message, cause);
	}

	public FunctionExecutionException(String message) {
		super(message);
	}

	public FunctionExecutionException(Throwable cause) {
		super(cause);
	}

}
