//Find four missing numbers in an array containing elements from 1 to N
public class MissingNumbersFromArray1ToNArray {
	 public static void missing4(int[] arr)  
	    { 
	        int[] helper = new int[4]; 
	 
	       for (int i = 0; i < arr.length; i++) { 
	            int temp = Math.abs(arr[i]);
	            System.out.println("T--"+arr[i]);
	            
	  
	            if (temp <= arr.length)  
	                arr[temp - 1] *= (-1); 
	  
	             else if (temp > arr.length) { 
	                if (temp % arr.length != 0) 
	                    helper[temp % arr.length - 1] = -1; 
	                else
	                    helper[(temp % arr.length) +  
	                                   arr.length - 1] = -1; 
	            } 
	        } 
	  
	        for (int i = 0; i < arr.length; i++)  
	            if (arr[i] > 0)  
	                System.out.print(i + 1 + " ");       
	        for (int i = 0; i < helper.length; i++)  
	            if (helper[i] >= 0)  
	                System.out.print(arr.length + i + 1 + " ");             
	          
	        return; 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        int[] arr = { 1, 7, 3, 12, 5, 10, 8, 4, 9 }; 
	        missing4(arr); 
	    } 
	
}
