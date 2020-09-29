package assignment3;

/*Q26 ::
 * Create an array of 17 elements in 5 rows.  And calculate sum of all elements.
 */

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("5 rows : ");
		int arr[][]=new int [5][];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter col for "+i);
			int col=sc.nextInt();
			arr[i]=new int[col];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter ele : ");
				arr[i][j]=sc.nextInt();
				sum+=arr[i][j];
			}
		}
		for(int ar[] : arr) {
			for(int a :ar) {
				System.out.print(a+" ");
			}
			System.out.println(" ");
		}
		System.out.println("Sum of all = "+sum);

	}

}
