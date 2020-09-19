import java.util.Scanner;
class Q18{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a = sc.nextInt();
		int flag=0;
		for(int i=2; i<a-1; i++){
			if(a%i==0){
				System.out.println(a+" : Not Prime");
				flag=1;				
				break;
			}
		}
		if(flag==0){
			System.out.println(a+" : Is Prime");
		}
	}
}
