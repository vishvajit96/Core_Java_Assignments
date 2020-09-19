import java.util.Scanner;
class Q8{
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principle Amount = ");
		double PA=sc.nextDouble();
		System.out.print("Enter Rate Of Interest = ");
		double RI=sc.nextDouble();
		System.out.print("Enter Time = ");
		double Time=sc.nextDouble();
		double SI = PA*RI*Time/100;
		System.out.print("Simple Interest = "+SI);
		
	}
}
