package Palindrome;

public class Pelindrome {
	static String str;
	
	public String ReverseString(String str)
	
	{
		String rev="";
	for(int i=str.length()-1; i>=0;i--)
	{
		rev=rev+str.charAt(i);
		
	}

	return rev;
	
	
		
	}
	public static void main(String[] args) {
		
		Pelindrome pl = new Pelindrome();
		String str1="teet";
		String strs= pl.ReverseString(str1);
		if(strs.equals(str1))
		{
			
		System.out.println("pelindrome");	
		}
		
		else
		{
			System.out.println("not peli");
		}
	}

}
