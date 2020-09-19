import java.util.Scanner;
class Q21{
	  public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int arr[]=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;

		System.out.println("The sum is= "+sum+" and average is "+avg);
	}
}
