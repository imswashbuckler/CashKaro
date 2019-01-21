package AProgramsPorblems;

import java.util.Scanner;

public class _JoinThem {
	static String[] str = { "harsh", "the", "fun", "college" };
	static String s1[] = { "harshharsh", "thefunky","collegefun" };
	static boolean isfound = false;
	
	
	public static void main(String[] args)
	
	{
		for(int i=0;i<s1.length;i++)
		{
			if(findstr(s1[i])==true)
			{
				System.out.println("Yes");
				
			}
			else
			{
				
				System.out.println("No");
			}
			
			
		}
		
		
	}
	
	


	public static boolean findstr(String str2)
	{
		isfound=false;
			for (int i = 0; i < str.length; i++) {

				for (int j = 0; j < str.length; j++)
				{
					String l = str[i] + str[j];
					
					
					if(str2.equals(l))
					{
					isfound=true;	
					
					}

					
				}
				

			
			
			}

			return isfound;

		}



	}

