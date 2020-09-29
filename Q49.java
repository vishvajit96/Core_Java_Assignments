package assignment4;

/*Q49 ::
 * Create Interface Taxable with members salesTax=7% and incomeTax=10.5%.
 * create abstract method calcTax(). 
 * a. Create class Employee(empId,name,salary)
 * 		 and implement Taxable to calculate incomeTax on yearly salary. 
 * b. Create class Product(pid,price,quantity) and implement Taxable to 
 * 		calculate salesTax on unit price of product. 
 * c. Create class for main method(Say XYZ), accept employee information 
 * 		and a product information from user and print income tax and sales tax respectively.
 */

interface Taxable {
	double salesTax = 0.07;
	double incomeTax = 0.105;

	void calcTax();
}

class Employee3 implements Taxable {
	private int empid;
	private String name;
	private double salary;

	public Employee3(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void calcTax() {
		double ysalary = this.salary * 12;
		double tax = ysalary * incomeTax;
		System.out.println("Yearly tax is : " + tax);
	}

}

class Product3 implements Taxable {
	private int pid;
	private double price;
	private int quantity;

	public Product3(int pid, double price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public void calcTax() {
		double tax = this.price * salesTax * this.quantity;

		System.out.printf("Sales TAX : %.3f", tax);
	}

}

public class Q49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Taxable t = new Employee3(1, "Tushar", 45000);
		t.calcTax();
		Taxable p = new Product3(2, 34, 3);
		p.calcTax();

	}

}
