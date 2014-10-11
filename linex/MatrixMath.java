// Matthew Huggins
// MatrixMath.java
// Math Utilities for Matrices

package linex;

import java.util.Arrays;

public class MatrixMath {
	

	
	public static Matrix matrixAdd(Matrix a, Matrix b) throws SizeMismatchException{
		if(Arrays.equals(a.size(), b.size())){
			
			for(int i = 0; i<a.rows(); i++)
				for(int j = 0; j<a.columns(); j++)
					a.data[i][j] += b.data[i][j];
			
			return a;
			
		} else throw new SizeMismatchException();
	}
	
	public static Matrix matrixScalMult(Matrix a, double c){
		for(int i=0; i<a.rows(); i++)
			for(int j=0; j<a.columns(); j++)
				a.data[i][j] *= c;
		
		return a;
	}
	
	/*
	public static Matrix matrixMult(Matrix a, Matrix b) throws SizeMismatchException{
		if(a.columns() == b.rows()){
			Matrix c = new Matrix(a.rows(), b.columns());
			
			// TODO Matrix Multiplication
			
			return c;
			
		}else throw new SizeMismatchException();
		
	}
	*/

}
