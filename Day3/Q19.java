import java.util.Scanner;
class Q19{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++){
			if(i==a){
				System.out.println(i*i);
			}
			else{
				System.out.print(i*i+"+");
			}
			sum+=i*i;
		}
		System.out.println("Sum = "+sum);
	}
}
