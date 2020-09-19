import java.util.Scanner;
class Q4{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value");
		byte b1 = sc.nextByte();
		System.out.println("Enter 2st value");
		byte b2 = sc.nextByte();
		byte b3 = (byte)(b1+b2);
		System.out.println("Sum = "+b3);
	}
}
