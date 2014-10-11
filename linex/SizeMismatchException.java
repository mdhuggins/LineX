// Matthew Huggins
// SizeMismatchException.java
// Size Mismatch Exception for Matrices and Vectors

package linex;

public class SizeMismatchException extends Exception{
	
	private static final long serialVersionUID = -8309763462205987262L;
	
	public SizeMismatchException(){
		super();
	}
	public SizeMismatchException(String msg){
		super(msg);
	}
	public SizeMismatchException(String msg, Throwable cause){
		super(msg, cause);
	}
	public SizeMismatchException(Throwable cause){
		super(cause);
	}
	
}
