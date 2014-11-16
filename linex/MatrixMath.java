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
	
	
	public static Matrix matrixMult(Matrix a, Matrix b) throws SizeMismatchException{
		if(a.columns() == b.rows()){
			Matrix result = new Matrix(a.rows(), b.columns());
			
			for(int i=0; i<a.rows(); i++)
				for(int j=0; j<b.columns(); j++)
					result.data[i][j] = VectorMath.vectorDot(a.rowToVector(i), b.columnToVector(j));
			
			return result;
			
		}else throw new SizeMismatchException();
		
	}
	
	public static Matrix reduce(Matrix m){
		Matrix a = m;
		for( int k = 0; k < Math.min(a.rows(), a.columns()); k++ ){
			// Find the k-th pivot
			int iMax = 0;
			int max = 0;
			for( int i = k; i<a.rows(); i++)
				if( Math.abs(a.data[i][k]) > max)
					iMax = i;
			a.switchRows(k, iMax);
			
			for( int i = k + 1; i < a.rows(); i++){
				for( int j = k + 1; j < a.columns();j++)
					a.data[i][j] = a.data[i][j] - a.data[k][j] * ( a.data[i][k] / a.data[k][k]);
				
				a.data[i][k] = 0;
			}
			
		}
		
		// Fix inaccuracies so zeros are zero 
		for( int i=0; i<a.rows();i++ )
			for( int j=0; j<a.columns();j++ )
				if( a.data[i][j] < .000000000000001)
					a.data[i][j] = 0;
		
		// Make all pivots one
		for( int i=0; i<a.rows(); i++){
			double p = 1;
			for(int k=0; k<a.columns();k++)
				if( a.data[i][k] != 0){
					p = a.data[i][k];
					break;
			}
			for(int k=0; k<a.columns();k++)
				a.data[i][k] /= p;
		}
		
		return a;
	}
	

}
