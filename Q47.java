package assignment4;

/*Q47 ::
 *Create a program to demonstrate constructor chaining.
 */

class A1{
	int x;
	public A1() {
		System.out.println("A Constructor");
	}
	public A1(int x) {
		System.out.println("Parameter A "+ x );
	}
}
class B extends A1{
	public B() {
//		super();
		this(4);
		System.out.println("B Constructor");
	}
	public B(int x) {
		super(x);
		System.out.println("Parameter B "+ x);
	}
}

public class Q47 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A1 b =new B();
	//	A1 b =new B(3);
		
	}
}
