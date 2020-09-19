import java.util.Scanner;
class Q7{
	public static void main(String a[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of Subjects : ");
		int subject=sc.nextInt();
		int totalMarks=0;
		for(int i=1;i<=subject;i++){
			System.out.print("Enter "+i+ "Subject's Marks = ");
			int marks=sc.nextInt();
			totalMarks += marks;
		}
		System.out.println("totalMarks = "+totalMarks);
		double percentage = totalMarks/(double)subject;
		System.out.println("Percentage = "+percentage+"%");
	}
}
