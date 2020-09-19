import java.util.Scanner;
class Q17{
	public static void main(String a[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=s.nextInt();
		int rev=0;
		int lastdigit=0;
		while(num>0){
			lastdigit=num%10;
			rev=(rev*10)+lastdigit;
			num=num/10;
		}
		System.out.println("Reversed Number = "+rev);
	}
}
