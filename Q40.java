package assignment4;

/*Q40 ::
 * Create a class Student having data members name, roll no., age and score. 
 * Write a program to accept 10 records of student and store them in an array. 
 * And then arrange the student records based on the score group [0-50], [50-65], 
 * [65-80], [80-100].
 */

import java.util.Scanner;

class Student{
	private String name;
	private int rollNo;
	private int age;
	private int score;
	Student(String name,int rollNo,int age,int score){
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		this.score=score;
	}
	public int getScore() {
		return score;
	}
	void show() {
		System.out.println("NAME = "+name+"  AGE = "+age+"  ROLL_NO = "+rollNo+"  SCORE = "+score);
	}
	
}
public class Q40 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student arr[]=new Student[10];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter Student name = ");
			String n=sc.next();
			System.out.print("Enter Student rollno = ");
			int r=sc.nextInt();
			System.out.print("Enter Student age = ");
			int a=sc.nextInt();
			System.out.print("Enter Student score = ");
			int sco=sc.nextInt();
			System.out.println(" ");
			Student s=new Student(n,r,a,sco);
			arr[i]=s;
		}
		System.out.println("Group 0 to 50");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()>0&&arr[i].getScore()<=50) {
				arr[i].show();
			}
		}
		System.out.println("Group 50 to 65");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()>50&&arr[i].getScore()<=65) {
				arr[i].show();
			}
		}
		System.out.println("Group 65 to 80");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()>65&&arr[i].getScore()<=80) {
				arr[i].show();
			}
		}
		System.out.println("Group 80 to 100");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getScore()>80&&arr[i].getScore()<=100) {
				arr[i].show();
			}
		}
		

	}

}