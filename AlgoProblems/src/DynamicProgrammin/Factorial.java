package DynamicProgrammin;

public class Factorial {
	int i=1;
	
	public int   factor(int n)
	{
		int[] fib =new int[n+1];
		 fib[0]=1;
		 
		 for(i=1;i<=n;i++)
		 {
			 fib[i]=i*fib[i-1]; 
			 
		 }
		 return fib[n];
	}
	
	public int factrec(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*factrec(n-1);
		
	}

	
	public static void main(String[] args) {
		
		Factorial fb=new Factorial();
		//int k =fb.factor(20);
		//System.out.println(k);
		int k =fb.factrec(30);
		System.out.println(k);
		
	}
}
