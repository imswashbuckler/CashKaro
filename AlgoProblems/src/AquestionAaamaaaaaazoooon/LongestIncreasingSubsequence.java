package AquestionAaamaaaaaazoooon;

public class LongestIncreasingSubsequence {

	 static int max_ref; // stores the LIS 
	  
	    /* To make use of recursive calls, this function must return 
	   two things: 
	   1) Length of LIS ending with element arr[n-1]. We use 
	      max_ending for this purpose 
	   2) Overall maximum as the LIS may end with an element 
	      before arr[n-1] max_ref is used this purpose. 
	   The value of LIS of full array of size n is stored in 
	   *max_ref which is our final result */
	    static int longestSubse(int arr[], int n) 
	    { 
	        // base case 
	        if (n == 1) 
	            return 1; 
	  
	        // 'max_ending' is length of LIS ending with arr[n-1] 
	        int res, max_ending = 1; 
	  
	        /* Recursively get all LIS ending with arr[0], arr[1] ... 
	           arr[n-2]. If   arr[i-1] is smaller than arr[n-1], and 
	           max ending with arr[n-1] needs to be updated, then 
	           update it */
	        for (int i = 1; i < n; i++) { 
	            res = longestSubse(arr, i); 
	            if (arr[i - 1] < arr[n - 1] && res + 1 > max_ending) 
	                max_ending = res + 1; 
	        } 
	  
	        // Compare max_ending with the overall max. And 
	        // update the overall max if needed 
	        if (max_ref < max_ending) 
	            max_ref = max_ending; 
	  
	        // Return length of LIS ending with arr[n-1] 
	        return max_ending; 
	    } 
	  
	    // The wrapper function for longestSubse() 
	    static int lis(int arr[], int n) 
	    { 
	        // The max variable holds the result 
	        max_ref = 1; 
	  
	        // The function longestSubse() stores its result in max 
	        longestSubse(arr, n); 
	  
	        // returns max 
	        return max_ref; 
	    } 
	  
	    // driver program to test above functions 
	    public static void main(String args[]) 
	    { 
	        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
	        int n = arr.length; 
	        System.out.println("Length of lis is "
	                           + lis(arr, n) + "\n"); 
	    } 
	} 
