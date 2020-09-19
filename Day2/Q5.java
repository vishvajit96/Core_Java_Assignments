import java.util.Scanner;
class Q5{
	public static void main(String a[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter radius = ");
		float r = sc.nextFloat();
		float area= (float)(3.14*r*r);
		float circ=(float)(2*3.14*r);
		System.out.println("Area = "+area);
		System.out.println("Circumference = "+circ);
	}
}
