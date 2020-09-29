package assignment4;

import java.util.Scanner;

/*
 * Create a class MathOperation that has four static methods. 
 * add() method that takes two integer numbers as parameter and 
 * returns the sum of the numbers. subtract() method that 
 * takes two integer numbers as parameter and returns the difference 
 * of the numbers. multiply() method that takes two integer numbers as parameter 
 * and returns the product. power() method that takes two integer numbers as 
 * parameter and returns the power of first number to second number. 
 * Create another class Demo (main class) that takes the two numbers from the user 
 * and calls all four methods of MathOperation class by providing entered numbers 
 * and prints the return values of every method.
 */

class MathOperation{
	private static int sum;
	private static int sub;
	private static int mul;
	private static int pow;
	
	static void add(int x,int y) {
		sum= x+y;
	}
	static void substract(int x,int y) {
		sub= x-y;
	}
	static void multiply(int x, int y) {
		mul= x*y;
	}
	static void power(int x,int y) {
		pow= (int) Math.pow(x, y);
	}
	static void display() {
		System.out.println("Addition = "+sum);
		System.out.println("Substraction = "+sub);
		System.out.println("Multiplication = "+mul);
		System.out.println("Power = "+pow);
	}
}

public class Q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		MathOperation.add(a,b);
		MathOperation.substract(a, b);
		MathOperation.multiply(a, b);
		MathOperation.power(a, b);
		MathOperation.display();

	}

}
