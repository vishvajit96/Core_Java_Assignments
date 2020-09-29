package assignment4;

import java.util.Scanner;

/*Q34 ::
 * Create a class Circle that has two data members, one to store the radius and 
 * another to store area and three methods first init() method to input radius 
 * from user, second calculateArea() method to calculate area of circle and third 
 * display() method to display values of radius and area. Create class CircleDemo ( main class) 
 * that creates the Circle object and calls init(), calculateArea() and display() methods
 */

class Circle{
	private float radius;
	private float area;
	private float pi=3.14F;
	
	void init(float radius) {
		this.radius=radius;
	}
	
	void calculateArea() {
		area=radius*radius*pi;
	}
	
	void display() {
		System.out.println("Radius = "+radius+" ::  Area = "+area);
	}
}
public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius = ");
		float radius= sc.nextFloat();
		Circle c = new Circle();
		c.init(radius);
		c.calculateArea();
		c.display();

	}

}
