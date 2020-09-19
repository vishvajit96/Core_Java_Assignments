import java.util.Scanner;
class Q23{
	  public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int arr[]=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}

		for(int i=arr.length-1;i<arr.length;i--)
		{	if(i==-1){
			break;
				}
			System.out.print(arr[i]+" ");
			
		}

	    }
	}
