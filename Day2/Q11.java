import java.util.Scanner;
class Q11{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		a=a+b;//10+5=15
		b=a-b;//15-5=10
		a=a-b;//15-10=5
		System.out.println("After Swap a="+a+" b = "+b);
		
	}
}