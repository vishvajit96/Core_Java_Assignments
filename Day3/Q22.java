import java.util.Scanner;
class Q22{
	    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int arr[]=new int[5];
		int temp=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
	 for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }  
	
		for(int i=0;i<arr.length;i++){			
		System.out.print(arr[i]+" ");
		}
		
	

	    }
	}
