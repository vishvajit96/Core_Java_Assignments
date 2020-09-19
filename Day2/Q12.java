import java.util.*;
class Q12{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int basic = sc.nextInt();
		float hra=0F,da=0F,gs=0F;
		if(basic<10000){		
			hra=(float)(basic*0.10);
			da=(float)(basic*0.90);
		}
		if(basic>=10000){		
			hra=2000F;
			da=(float)(basic*0.98);
		}
		gs=(float)(basic+da+hra);
		System.out.println("Gross Salary "+gs);
	}
}