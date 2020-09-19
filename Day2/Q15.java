import java.util.*;
class Q15{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		
		int c=sc.nextInt();
		if(((a=='F'|| a=='f')&& c>=18) || ((a=='M'|| a=='m') && c>=21)) {
			System.out.println("Eligible for marriage");
		}
		else
		{
			System.out.println("Not Eligible for marriage");
		}

	}
}