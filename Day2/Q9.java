import java.util.*;
class Q9{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int d= sc.nextInt();
		int y=d/365;
		int rd=d%365;
		
		int m=rd/30;
		int ard=rd%30;
		System.out.println( y+" Years "+m+" Months "+ard+" Days ");

			
		
	}
}