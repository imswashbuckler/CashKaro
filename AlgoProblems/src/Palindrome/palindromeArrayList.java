package Palindrome;

public class palindromeArrayList {
	
	
	public boolean checkPalindromaArray(int[] arr)
	{
		boolean b = true;
		if(arr.length>0)
		{

		int l=arr.length/2;
		for(int i=0;i<=arr.length/2;i++)
		{
			if(arr[i]!=arr[arr.length-1-i])
			{
				b=false;
				break;
				
			}		
		
	}
		
	}
		else
		{
			System.out.println("blank Array");
			
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		palindromeArrayList obj = new palindromeArrayList();
		
	    int[] arr={1,2,1};
	    String[] arr1={"asa","lkl","asa"};
		System.out.println(obj.checkPalindromaArray(arr));
			
			
		}
		
		
		
	

}
