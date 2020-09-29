package assignment4;

import java.util.Scanner;

/*Q39 ::
 *Create class Product with three data members (pid, price, quantity) and 
 *parameterized constructor that takes values for all three data members.  
	Create a main method in different class (say ProductDemo) and perform following task:
		a. Accept information for five Product objects from user and store objects in an array
		b. Find pid of product with highest price. 
		c. Create a static method (with array of product’s object as argument) in Product 
		class to calculate and return total amount spent on all products. 
		( amount spent on single product = price of product * quantity of product )
 */

class Product{
	private int pid;
	private float price;
	private int quantity;
	
	public Product(int pid, float price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	static int maxPid(Product b[]){
		double a=b[0].price;
		int k=0;
		for(int i=0;i<b.length;i++){
			if(a<b[i].price){
				a=b[i].price;
			}
		}
		for(int i=0;i<b.length;i++){
			if(b[i].price==a){
				k=b[i].pid;
			}
		}
		return k;
	}
	
	static void show(Product a[]){
		int p1=maxPid(a);
		System.out.println("Max_PID = "+p1);
		double amount=0;
		for(int k=0;k<a.length;k++){
			amount=amount+a[k].price*a[k].quantity;
		}
		System.out.println("Total Amount Spend = "+amount+" RS");
	}
}

public class Q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product ar[]=new Product[5];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter product details :");
			System.out.print("Enter PID = ");
			int p=sc.nextInt();
			System.out.print("Enter PRICE = ");
			float pr=sc.nextFloat();
			System.out.print("Enter QUANTITY = ");
			int q=sc.nextInt();
			System.out.println(" ");
			Product p1=new Product(p,pr,q);
			ar[i]=p1;
		}
		Product.show(ar);
	}

}
