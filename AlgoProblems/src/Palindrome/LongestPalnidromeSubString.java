package Palindrome;

public class LongestPalnidromeSubString {
	
	
	public static void PalindromSubs(String str)
	{
		int newlenght=0; 
		
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=str.length()-1;j>=i;j--)
			{
			String substr=str.substring(i, j);
			if(isPalindrome(substr)==true)
			{
				if(substr.length()>newlenght)
				{
					newlenght=substr.length();
					System.out.println(substr+"       I:"+i + "J:"+j);
				}
				
			}
			
			
			}
			}
		
	}
	
	public static boolean isPalindrome(String str)
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
	
	
	static void printSubStr(String str, int low, int high) {
        System.out.println(str.substring(low, high + 1));
    }
 
    static int longestPalSubstr(String str) {
        int n = str.length();   // get length of input string
 
        boolean table[][] = new boolean[n][n];
 
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
 
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
         
        // Check for lengths greater than 2. k is length
        // of substring
        for (int k = 3; k <= n; ++k) {
             
                  // Fix the starting index
            for (int i = 0; i < n - k + 1; ++i) 
            {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && str.charAt(i) ==str.charAt(j)) 
                {
                    table[i][j] = true;
                     if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is; ");
        printSubStr(str, start, start + maxLength - 1);
         
        return maxLength; // return length of LPS
    }	
	
	public static void main(String[] args)
	{
		String str="abbabbaxabbabbatoppottoppottoppotabbabbayabbabba";
		boolean c=isPalindrome(str);
		System.out.println(c);
		PalindromSubs(str);
		
		
	}
		
}
