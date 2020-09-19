import java.util.Scanner;
class Q25{
	  public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int arr[]=new int[10];
		int sumE=0;
		int sumO=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}

		for(int i=0;i<arr.length;i++)
		{	if(arr[i]%2==0){
				sumE=sumE+arr[i];			
				}
			else{
				sumO=sumO+arr[i];
				}
			
		}
		
		System.out.println("Sum of Even No is "+sumE+" and odd no is "+sumO);

	    }
	}
