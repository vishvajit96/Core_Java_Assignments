class Q24{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a[] =new int[5];
	int y,f=0;
		for(int i=0;i<a.length;i++)
		{	
		a[i]=sc.nextInt();	
		}
		y=sc.nextInt();
		for(int x:a){
		if(x==y){
			System.out.println("Found" +x);
			f=1;
			break;}
		}
		if(f==0){
			System.out.println("Not Found" +y);
			}
	}
	
}
