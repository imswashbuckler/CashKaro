package Palindrome;

public class PalindromeLongestString {
	static int lo;
	static int maxLen = 0;
public static boolean checkPalindrome(String str)
{
	  int l=str.length();
		int i =0;
		boolean result=true;
		int j=str.length()-1;
		while(i<l/2 && j>=l/2)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				result=false;
				break;
			}
			i++;
			j--;		
		}
		return result;	
	}
	public static String getLongestPalindrome(final String input) {
        int rightIndex = 0, leftIndex = 0;
        String currentPalindrome = "", longestPalindrome = "";
        for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;  rightIndex = centerIndex + 1;
            while (leftIndex >= 0 && rightIndex < input.length()) {
                if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
                    break;
                }
                currentPalindrome = input.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
                leftIndex--;  rightIndex++;
            }
        }
        return longestPalindrome;
    }
    

    static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right)
			 return null;
		while (left >= 0 && right < s.length()	&& s.charAt(left) == s.charAt(right))
		{
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

	public static String longestPalindromeString(String s) {
		if (s == null) return null;
		 String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			//odd cases like 121
			String palindrome = intermediatePalindrome(s, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			//even cases like 1221
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}	
		}
		return longest;
	}
	
	
	public static String longestPalindrome(String s) {
		int len = s.length();
		
	    for (int i = 0; i < len-1; i++) {
	     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
	     	extendPalindrome(s, i, i+1); //assume even length.
	    }
	    return s.substring(lo, lo + maxLen);
	}

	private static void extendPalindrome(String s, int j, int k) {
		 

		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k))
		{
			j--;
			k++;
		}
		if (maxLen < k - j - 1) {
			lo = j + 1;
			maxLen = k - j - 1;
		}
		
		
	}

	
		public static  void longestPalindromebruteforce(String s) {
		
		String sr="";
		int len=0;
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=i+1;j<s.length();j++)
			{
			
				String s1=s.substring(i, j+1);

				
					if(checkPalindrome(s1)==true)
					{
						if(sr.length()<s1.length())
						{
						
						sr=s1;		
						
						}
				
					}				
				}
			
		}
	
	System.out.println(sr);
	
	}

		
		public static String longestPalindromeDynamic(String s) {
		    if(s==null || s.length()<=1)
		        return s;
		 
		    int len = s.length();
		    int maxLen = 1;
		    boolean [][] dp = new boolean[len][len];
	    
		    String longest = null;
		    for(int p=0; p<len; p++){
		        for(int i=0; i<len-p; i++)
		        {
		            int j = i+p;
		         //   System.out.println("L----"+p+"  I----"+i+"  J----"+j);
		            if(s.charAt(i)==s.charAt(j) &&	(j-i<=2||dp[i+1][j-1]))
		            {
		                dp[i][j]=true;
		 
		                if(j-i+1>maxLen){
		                   maxLen = j-i+1; 
		                   longest = s.substring(i, j+1);
		                }
		            }
		        }
		    }
		 
		    return longest;
		}
			    
			
		public static String longestPalindromebySubs(String s) {
			if (s.isEmpty()) {
				return null;
			}
		 
			if (s.length() == 1) {
				return s;
			}
		 
			String longest = s.substring(0, 1);
			for (int i = 0; i < s.length(); i++) {
				// get longest palindrome with center of i
				String tmp = helper(s, i, i);
				if (tmp.length() > longest.length()) {
					longest = tmp;
				}
		 
				// get longest palindrome with center of i, i+1
				tmp = helper(s, i, i + 1);
				if (tmp.length() > longest.length()) {
					longest = tmp;
				}
			}
		 
			return longest;
		}
		 
		// Given a center, either one letter or two letter, 
		// Find longest palindrome
		public static String helper(String s, int begin, int end) {
			while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
				begin--;
				end++;
			}
			return s.substring(begin + 1, end);
		}	
			
		
		
		
    public static void main(String[] args) {
        String str = "abbabbaxabbabbatoppottoppottoppotabbabbayabbabba";
    	PalindromeLongestString obj = new  PalindromeLongestString();
    	
    	//obj.longestPalindromebruteforce(str);
        	
    	String s=longestPalindromeDynamic(str);
    	System.out.println(s);
    	
    //	String result=longestPalindromebySubs(str);
    	//System.out.println(result);
    	//longestPalindromebySubs(str);

	}
}
