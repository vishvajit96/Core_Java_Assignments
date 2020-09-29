package assignment3;

/*Q30 ::
 * Create an integer type 2-D array of size [3X3]. Take the elements from the user 
 * and then calculate the sum of the elements present in the diagonal.
 */
import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row=3;
		int col=3;
		int arr[][]=new int [row][col];
		System.out.println("Enter Elements in 3*3 array : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter Elements at "+i+" row : ");
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		//for diagonal sum :
		int sum=0;
		int a=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i][i];
			a=a+arr[i][row-i-1];
		}
		System.out.println("Diagonal Sum = "+sum);
		System.out.println("Off-Diagonal Sum = "+a);

	}

}
