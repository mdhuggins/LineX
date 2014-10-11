// Matthew Huggins
// VectorMath.java
// Math Utilities for Vectors

package linex;

public class VectorMath {

	public static Vector vectorAdd(Vector a, Vector b) throws SizeMismatchException{
		if(a.size() == b.size()){
			
			for(int i = 0; i<a.size(); i++)
				a.data[i] += b.data[i];
			
			return a;
			
		} else throw new SizeMismatchException();
	
	}
	
	public static Vector vectorScalMult(Vector a, double c){
		for(int i=0; i<a.size(); i++)
			a.data[i] *= c;
		
		return a;
				
	}
	
	public static double vectorDot(Vector a, Vector b) throws SizeMismatchException{
		if(a.size() == b.size()){
			
			double result = 0;
			
			for( int i=0; i<a.size(); i++)
				result += a.data[i] * b.data[i];
			
			return result;
			
		} else throw new SizeMismatchException();
	
	}
	
	// TODO Cross Product for n-dimensions
	/*
	public static Vector vectorCross(Vector a, Vector b) throws SizeMismatchException{
	
	}
	*/

}
