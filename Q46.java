package assignment4;	

/*Q46 ::
 * Create a program to demonstrate the use of instanceof 
 * operator or secure reference down casting.
*/

class Person1{
	public void show() {
		System.out.println("Person Show");
	}
}
class Manager extends Person1{
	public void show() {
		System.out.println("Manager Show");
	}
}

public class Q46 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	DownCasting
	/*	Person1 p= new Manager();
		Manager m =(Manager)p;
		m.show();
	*/
		
		Person1 arr[]= {new Manager(),new Person1(),new Manager(),new Person1(),new Manager()};
		
		for(Person1 x : arr) {
			if (x instanceof Manager) {
	//			Manager m =(Manager)x;
				x.show();
			}
		}
		
	//	Manager Show
	//	Person1 Show
	//	Manager Show
	//	Person1 Show
	//	Manager Show
	}
}