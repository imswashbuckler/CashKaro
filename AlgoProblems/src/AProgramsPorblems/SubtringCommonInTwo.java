package AProgramsPorblems;

import java.util.ArrayList;

public class SubtringCommonInTwo {

	static String LongStr="";

	public static void dispay2darray1(int[][] arr) {
		int r = arr.length - 1;
		int c = arr[0].length - 1;
		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int longestCommonSubstring(String str1, String str2)
	
	{	
		
		int i=0;
		int j=0;
		
		int T[][] = new int[str1.length()][str2.length()];
		ArrayList<String> result=null;

		int max = 0;
		for ( i = 0; i < str1.length(); i++) {
			for ( j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j))
				{
					T[i][j] = T[i - 1][j - 1] + 1;
					if (max < T[i][j]) 
					{
						max = T[i][j];
						result= new ArrayList<String>();
						result.add(str1.substring(i-max+1,i+1));
						}
							
				}
			}
			
			
		}
		System.out.println(result.toString());
		dispay2darray1(T);
		System.out.println(i+" "+j);

					return max;
	}

public static void Subs(String s1,String s2)
{
	for(int i=0;i<s1.length();i++)
	{

		for(int j=i;j<s1.length();j++)
		{
			String substr=s1.substring(i,j+1);
			SubsCheck(s2,substr);
		
		}
			
		
	}
	
}


public static void SubsCheck(String s2,String Subs)
{
	for(int i=0;i<s2.length();i++)
	{

		for(int j=i;j<s2.length();j++)
		{
			String k=s2.substring(i,j+1);
			if(Subs.equals(k))
				
			{
				if(Subs.length()>LongStr.length())

				{
			 LongStr=Subs;
				}
			}
		}
			
		
	}
	
	
}

	
	
	
	
	public static void main(String[] args) {

		String str1= "abcdefghicjk";
		String str2 = "EcdefghicB";
		SubtringCommonInTwo obj = new SubtringCommonInTwo();
		
		//Dynamic Programming
		//obj.longestCommonSubstring(str1, str2);
		
		//BruteForce
		Subs(str1,str2);
		System.out.println("By BruteForce:    "+LongStr);
		


	}
}
