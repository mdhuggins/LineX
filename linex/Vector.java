// Matthew Huggins
// Vector.java

package linex;

public class Vector {
	
	double[] data;
	
	public Vector(){
	}
	
	public Vector(int n){
		data = new double[n];
	}
	
	public Vector(double[] dat){
		data = dat;
	}
	
	public int size(){
		return data.length; 
	}
	
	public void print(){
		for(int i=0; i<this.size(); i++)
			System.out.print(data[i]+"\t");
		System.out.println();
	}
	
}
