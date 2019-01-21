package ADeafult;

public class ReverseNumber {

	public static int revNumber1(int n)
	{
		int rev=0;
		while(n>0)
		{
			int r=n%10;
		
			rev=rev*10+r;
			n=n/10;
	
		}
		return rev;
		
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(revNumber1(783758));
		
	}

}
