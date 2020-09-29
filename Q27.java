package assignment3;

/*Q27 ::
 * Write a program to find the smallest and greatest number present in the array of integer type.
 */

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int great=0;
		int small=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int a : arr) {
			System.out.print(" "+a);
		}
		int a=arr[0];
		for(int i=0;i<5;i++)
		{
			if(a<arr[i])
			{
				a=arr[i];
			}
			
		}
		System.out.println(" ");
		System.out.println("Gratest   "+a);
		for(int i=0;i<5;i++)
		{
			if(a>arr[i])
			{
				a=arr[i];
			}
		}
		System.out.println("Smallest    "+a);
		
	}

}
