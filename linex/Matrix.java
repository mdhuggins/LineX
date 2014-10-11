// Matthew Huggins
// Matrix.java
// Matrix object, currently for double values only.

package linex;

public class Matrix{
	
	double[][] data;
	
	public Matrix(){
		
	};
	
	public Matrix(double[][] dat){
		data = dat;
	}
	
	public Matrix(int rows, int cols){
		data = new double[rows][cols];
	}
	
	public void switchRows(int c1, int c2){
	 double[] temp = data[c1];
	 data[c1] = data[c2];
	 data[c2] = temp;
	}
	
	public void rowAdd(int r1, int r2, int c){
		for(int i = 0; i<data[r1].length; i++)
			data[r1][i] += c * data[r2][i];
	}
	
	public void print(){
		for(double[] row:data){
			for(double entry:row)
				System.out.print(entry+"\t");
			System.out.println();
		}
	}
	
	public int[] size(){
		int[] size = new int[2];
		size[0] = data.length;
		size[1] = data[0].length;
		return size;
	}
	
	public int rows(){
		return data.length;
	}
	
	public int columns(){
		return data[0].length;
	}
	
	// TODO rowToVector
	/*
	public Vector rowToVector(int row){
		
	}
	*/
	
	// TODO columnToVector
	/*
	public Vector columnToVector(int col){
	
	}
	*/
	
}


