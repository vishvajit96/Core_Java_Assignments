package assignment4;

/*Q33 ::
 * Write a program to demonstrate functionalities of this keyword in java. 
 */

class ThisDemo{
	private int id;
	private String name;
	
	ThisDemo(){
		
	}
	void setDemo1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	void setDemo2(int xx,String zz) {
		id=xx;
		name=zz;
	}
	void setDemo3(int id,String name) {
		id=id;
		name=name;
	}
	void getData() {
		System.out.println(id+"  "+name);
	}
}

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo a = new ThisDemo();
		a.setDemo1(101, "Same Instance & Local variables Using this keyword");
		a.getData();
		a.setDemo2(102, "Instance & Local variables having Different names Without Using this keyword");
		a.getData();
		a.setDemo3(103, "Same Instance & Local variables Without this keyword");
		a.getData();


	}

}
