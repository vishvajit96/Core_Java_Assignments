package assignment4;

/*Q38 ::
 * Create a class Employee with three data members (empNo, salary and totalSalary) 
 * and following features.
        a. Only parameterized constructor. [Do not overload the constructor]
        b. totalSalary always represents salary total of all the employees created.
        c. empNo should be auto incremented.
        d. display total employees and totalSalary using a method.
	Create another class EmployeeDemo (main class) that creates some Employee 
	objects and calls Employee method to display no. of employees and total of their salaries.
 */


class Employee{
	private static int empNo;
	private double salary;
	private static double totSalary;
	
	Employee(int epmNo,int salary){
		empNo++;
		this.salary=salary;
		totSalary+=salary;
	}
	void display(){
		System.out.println("Employees are = "+empNo);
		System.out.println("Total Salary Of "+empNo+" Employee is = "+totSalary);
	}
}

public class Q38{
	public static void main(String args[]){
		Employee e1 = new Employee(1,10000);
		Employee e2 = new Employee(2,20000);
		Employee e3 = new Employee(3,30000);
		e3.display();
		Employee e4 = new Employee(4,10000);
		Employee e5 = new Employee(5,20000);
		e5.display();
	}
}

/*
class Employee{
	private int empNo=100;
	private int salary;
	private int totalSalary=0;
	private int count=0;
	
	Employee(int salary){
		empNo++;
		this.salary=salary;
		totalSalary+=salary;
	}
	
	void totalSalary() {
		totalSalary=totalSalary+salary;
		empNo++;
		count++;
		show();
	}
	
	void show() {
		System.out.println("Total Employee = "+empNo+"  TotalSalary = "+totalSalary);
	}
}

public class Q38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(2000);
		e.show();
		Employee e1 = new Employee(1000);
	
		Employee e2 = new Employee(1000);
		e2.show();

	}

}
*/