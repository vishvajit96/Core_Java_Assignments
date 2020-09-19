import java.util.*;
class Q14{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%4==0){		
			if(a%100==0)
			{	
				if(a%400==0)
				{
					System.out.println(a+" Is Leap Year");
				}
				else
				{
					System.out.println(a+" Is Not Leap Year");
				}
			}
			else
			{
				System.out.println(a+" Is Leap Year");
			}
			
		}
		else
		{
			System.out.println(a+" Is Not Leap Year");
		}
	}
}