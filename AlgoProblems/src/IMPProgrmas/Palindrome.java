package IMPProgrmas;

public class Palindrome {
	
	public static boolean checKpalindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		int l=str.length()-1;
		boolean b=true;
			while(i<l/2 && j>l/2)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					b=false;
					break;
				}
					
				i++;
				j--;
			}
			
		return b;
		
		
	}
	
	public static void main(String[] args) {
	boolean k=	checKpalindrome("a");
	System.out.println(k);
		
	}

}
