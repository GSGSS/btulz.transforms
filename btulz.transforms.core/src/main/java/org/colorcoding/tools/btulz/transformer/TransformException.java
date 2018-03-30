package org.colorcoding.tools.btulz.transformer;

public class TransformException extends Exception {

	private static final long serialVersionUID = 5270788920435746555L;

	public TransformException() {
		super();
	}

	public TransformException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public TransformException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public TransformException(String arg0) {
		super(arg0);
	}

	public TransformException(Throwable arg0) {
		super(arg0);
	}

}
