import java.util.Scanner;
class Q6{
	public static void main(String a[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter radius : ");
		double radius=sc.nextDouble();
		double pi=3.14;
		double area=pi*radius*radius;
		System.out.println("area= "+area);
	}
}
