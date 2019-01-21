package ADeafult;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	/*public static int[] RemoveDuplicate1(int[] input) {
		        int j = 0;
		        int i = 1;
		               while(i < input.length){
		            if(input[i] == input[j]){
		                i++;
		            }else{
		                input[++j] = input[i++];
		            }    
		        }
		        int[] output = new int[j+1];
		        for(int k=0; k<output.length; k++){
		            output[k] = input[k];
		        }
		         
		        return output;
		    }
*/	
	 static int removeDuplicates(int arr[], int n)
	    {
	          int j = 0;
	      
	        for (int i = 0; i < n-1; i++)
	        {
	            if (arr[i] != arr[i+1])//012345677
	            {
	                arr[j] = arr[i];
	                j++;
	            }
	        }
	        arr[j++] = arr[n-1];
	      
	        return j;
	    }
	
/*	public  static int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
*/	
	public static void main(String[] args) {

		int[] arr1 = { 1,1,2,2,3,5,5,6,6};
		int[] arr2 = { 1, 1, 2, 3, 3, 4, 4,7 };
		int[] arr3 = { 1,1, 2,2};
		int[] arr4 = { 1,1};
		int[] arr5 = { 1,1,1,1,1,1,1,1,1,1,1,1};
		int[] arr6 = { 1,2};	
		
	//int[] output=RemoveDuplicate1(arr2);
	//System.out.println(Arrays.toString(output));
	
	
	 int n = arr1.length;
     n = removeDuplicates(arr1, n);
 for (int i=0; i<n; i++)
        System.out.print(arr1[i]+" ");
 }
	
	
	}


