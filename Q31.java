package assignment3;

/*
 * Create a class Student with 2 data members rno and name. 
 * Create one method setData() that takes roll number and student name as parameter and 
 * stores them in data members rno and name. Create one more method showData() to print 
 * the data member values. Create another class ( main class) StudentDemo that creates 
 * Student class object and calls setData() and showData() methods.
 */

class Student{
	private int rno;
	private String name;
	
	public void setData(int rno, String name) {
		this.rno=rno;
		this.name=name;
	}
	public void showData() {
		 System.out.println(rno+"  "+name);
	 }
}

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setData(101, "Vishva");
		s.showData();
	}

}
