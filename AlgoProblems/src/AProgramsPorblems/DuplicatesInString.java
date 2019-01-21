package AProgramsPorblems;

import java.util.Arrays;

public class DuplicatesInString {
	
	public static void main(String[] args) {
		
		String str="ebabecdfbcag";
		
		char[] str1=str.toCharArray();
		
		for(int i=0;i<str1.length;i++)
			
		{
			for(int j=i+1;j<str1.length;j++)
				
			{
				if(str1[j]!=1)
				{
					if(str1[i]==str1[j])
						
					{
						System.out.println(Arrays.toString(str1));
						str1[j]=1;
						break;
					}
				}
			}
			
		}
		System.out.println(Arrays.toString(str1));
		
	}

}
