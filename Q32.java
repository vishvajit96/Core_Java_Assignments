package assignment3;

/*Q32 ::
 * Modify the above program (no. 31) to count the no of Student objects created. 
 * [ In this program static variable is required ]
 */

class Student1{
	private int rno;
	private String name;
	private static int count;
	
	public void setData(int rno, String name) {
		this.rno=rno;
		this.name=name;
	}
	public void showData() {
		 System.out.println(rno+"  "+name);
	 }
	
	Student1(){
		count++;
	}
	
	void getCount() {
		System.out.println("Object Count = "+count );
	}
}

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1();
		s.setData(101, "Vishva");
		s.showData();
		
	//	Student1 s1 = new Student1();
	//	Student1 s2 = new Student1();
		s.getCount();
	}

}