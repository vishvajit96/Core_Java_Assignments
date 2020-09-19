class Q3{
	
	public static void main(String args[]){
	int x,y,z;
	x=7;
	
	y=(x*x)+(3*x)-7;
	System.out.println("value of y= "+y);
	
	y=x++ + ++x;
	System.out.println("value of y= "+y);
	System.out.println("value of x= "+x);
	
	z=x++ - --y - --x + x++;
	System.out.println("value of x= "+x);
	System.out.println("value of y= "+y);
	System.out.println("value of z= "+z);
	
	boolean a=true;
	boolean b=false;
	boolean c=true;
	c=a&&b||!(a||b);

	System.out.println("value of z= "+c		);
	
	}
}