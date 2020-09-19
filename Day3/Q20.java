import java.util.Scanner;
class Q20{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter range : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a; i<=b; i++){
			int flag=0;
			for(int j=2;j<=i/2;j++){
				if(i%j == 0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(i);
			}
		}
	}
}
