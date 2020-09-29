package assignment4;


/*Q50 ::
 * Explain the importance of toString() and equals() method of the 
 * Object class and override them on class Employee(empId,name,salary).  
 * a. Create class for main method(say XYZ),and accept five employees 
 * 		information and store in an array. Also ensure if entered empId 
 * 		already exist or not (use equals method).  
 * b. Display all employee info using toString method.
*/

class Emp {
	int empId;
	String name;
	double salary;

	Emp() {

	}

	int getempId() {
		return empId;
	}

	public Emp(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override

	public String toString() {
		return "empId= " + empId + ", name= " + name + ", salary= " + salary;
	}

	@Override
	public boolean equals(Object a) {
		Emp e = (Emp) a;
		return empId == e.empId;
	}

}

public class Q50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e[] = { new Emp(20, "vishva", 20000), new Emp(10, "abhi", 25000), new Emp(10, "sourabh", 40000) };

		System.out.println("enter empId to check exists or not");
		// Scanner sc = new Scanner(System.in);
		// int n=sc.nextInt();

		for (int i = 1; i < e.length; i++) {
			if (e[0].equals(e[i])) {
				System.out.println("id is already there");
			}
		}

		for (Emp i : e) {
			System.out.println(i);
		}
	}

}
