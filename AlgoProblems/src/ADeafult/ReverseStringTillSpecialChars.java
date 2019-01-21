package ADeafult;

import java.util.Arrays;

public class ReverseStringTillSpecialChars {
	
	public static void RevStringSp(String str)
	{
		String s1="";
		String s2="";
		String[] strA=str.split(" ");
		
		for(int i=0;i<strA.length;i++)
		{
			char[] charA=strA[i].toCharArray();
			
			for(int j=0;j<charA.length;j++)
			{
				int asci= charA[j];
			
				//System.out.println(asci);
				if((asci>64 && asci<90) || (asci>96 && asci<123))
				{
					s1=s1+charA[j];
					
				}
				else
				{
					StringBuilder sb = new StringBuilder(s1);
					s1=sb.reverse().toString();
					s2=s1+charA[j];
					
					
				}
				
			}
			
			System.out.println(s2);
			s2="";
			s1="";
			
		}
}

	public static void main(String[] args) 
	{
		String str="ABC@DG H!IJ KL&MNOP $QRS%TU";
		RevStringSp(str);
		
	}
}
