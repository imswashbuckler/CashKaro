package Brills;
import java.util.HashMap;
public class  ZeroSumSubarray {

   static HashMap<Integer, Integer> hM = 
            new HashMap<Integer, Integer>();
   
   
	static Boolean printZeroSumSubarray(int arr[])
 {

      
     // Initialize sum of elements
     int sum = 0;        
      //     int arr[] = {4, 2, -3, 1, 6};
     // Traverse through the given array
     for (int i = 0; i < arr.length; i++)
     {   System.out.println(i);
         // Add current element to sum
         sum += arr[i];
          
         if (arr[i] == 0 || sum == 0 || hM.containsKey(sum)==true)                            
         {
        	 return true;
         }
         else
         {
         hM.put(sum, i);
         }
     }    
     return false;
 }        
  
	
	static void printZeroSumSubarray1(int arr[])
 {
		boolean b=false;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+arr[j];
				
				if(sum==0)
				{
					b=true;
					System.out.println("its from Index "+i+" to "+j);
					
				}
				
				
			}
			
		}
      
   
 }        
  
 public static void main(String arg[])
 {
     int arr[] = {-4,4,-3,3,4,-2,2, 7, -1,-6};
     if (printZeroSumSubarray(arr))
         System.out.println("Found a subarray with 0 sum");
     else
         System.out.println("No Subarray with 0 sum");
     
     System.out.println(hM);
     
     printZeroSumSubarray1(arr);
 }            
}