package assignment4;

/*
 *Create a class MathOperation containing overloaded methods ‘multiply’ to 
 *calculate multiplication of following arguments. 
 *       a.  two integers 
 *       b.  three floats 
 *       c.  all elements of array 
 *       d. one double and one integer
 */

class MathOperation1{
	private int res;
	int multiply(int a,int b) {
		res=a+b;
		return res;
	}
	int multiply(float a,float b,float c) {
		res=(int) (a*b*c);
		return res;
	}
	int multiply(int ar[]) {
		int a=1;
		for(int i=0;i<ar.length;i++) {
			a=a*ar[i];
		}
		res=a;
		return res;
	}
	int multiply(double a,int b) {
		res=(int) (a*b);
		return res;
	}
	
	void show() {
		System.out.println("Result is = "+res);
	}
}

public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation1 m = new MathOperation1();
		m.multiply(10,5);
		m.show();
		m.multiply(2.5F,3.5F,1.5F);
		m.show();
		int arr[]={3,2,3,4};
		m.multiply(arr);
		m.show();
		m.multiply(22.5556789,2);
		m.show();
	}

}
