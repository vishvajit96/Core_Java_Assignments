package assignment4;

/*Q37 ::
 *Create a class Person with properties (name and age) with following features. 
        a. Default age of person should be 18.
        b. A person object can be initialized with name and age.
        c. Method to display name and age of person
 *Create another class PersonDemo ( main class ) that demonstrates the functionalities
 *of Person class by creating Person object and calling methods.
 */

class Person{
	
	private String name;
	private int age;

	Person(String name){
		age=18;
		this.name=name;
	}
	
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	
	void show() {
		System.out.println(name+"  "+age);
	}
}

public class Q37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(25,"Sham");
		Person p1 = new Person("Ram");
		p.show();
		p1.show();
	}

}
