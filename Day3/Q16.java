import java.util.Scanner;
class Q16{
	public static void main(String a[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=s.nextInt();
		for(int i=1;i<=10;i++){
			int pro = num*i;
			System.out.println(pro);
		}
	}
}
