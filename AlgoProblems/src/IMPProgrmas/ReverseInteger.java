package IMPProgrmas;

public class ReverseInteger {
	
	
	public int test(int a,int b)
	{
			return a;
	}
	
	private void test(String a,int b)
	{
		System.out.println("Sa");
	}
	public static void printnum(int k)
	{
		for(int i=1;i<k;i++)
		{
			for(int j=1;j<=i;j++)
			{			
			System.out.print(i);
			
			}
			System.out.println();
		}
		
	}
	
	static int sum=0;
	public static int reverseInter(int p)
	{
		while(p>0)
		{
			int q=p%10;
			sum=sum*10+q;
			p=p/10;
			
			
			
		}
		
		return sum;
		
	}
	
	public static void reveseInteger(int i)
	{
		int s=0;
		while(i>0)
		{

			int m=i%10;
		 s=s*10+m;
		 i=i/10;
			
		}
		System.out.println(s);
		
		
	}
	public static void main(String[] args) {
		
		
		//printnum(5);
	//int rev=reverseInter(123);
	//System.out.println(rev);
	ReverseInteger f = new ReverseInteger();
	/*f.test(3);
	f.test(3.4f);	
*/	reveseInteger(12345);
	
	}

}
