package AProgramsPorblems;

import java.util.Arrays;

public class _RemoveDuplicateFromString {
	
	
	public static void removeDuplicates(String str)
	{
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='-';
				}
				}
		}
		
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='-')
			{
				System.out.print(ch[i]);
				
			}
			
		}
		
		
	}

	
	public static void main(String[] args) {
		
		_RemoveDuplicateFromString rm = new _RemoveDuplicateFromString();
		removeDuplicates("AABCAFBLMNBB");
		
	}
}
