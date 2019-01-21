package AProgramsPorblems;

import java.util.Arrays;

class ProductArrayExceptGivenIndex
{
    public static void productArray1(int arr[]) 
    {  
    	int[] prod = new int[arr.length];
    	
    	for(int i=0;i<prod.length;i++)
    	{
    	
    		prod[i]=multi(arr, i);
    		
    	}
    	
    	System.out.println(Arrays.toString(prod));
    }
    
    public  static int multi(int[] arr,int k)
    {
    	int result=1;
    
    	for(int i=0;i<arr.length;i++)
    		
    	{
    		if(i!=k)
    			
    		{
    			result=result*arr[i];
    			
    		}
    		
    	}
		return result;
    	   	
    }

	
	
    void productArray(int arr[], int n) 
    {
    	int i, temp = 1;
        int prod[] = new int[n];
        for(int j=0;j<n;j++)
            prod[j]=1;
 
        for (i = 0; i < n; i++) 
        {
            prod[i] = temp;
            temp *= arr[i];
        }
        temp = 1;
        for (i = n - 1; i >= 0; i--) 
        {
            prod[i] *= temp;
            temp *= arr[i];
        }
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");
 
        return;
    }
    public static void main(String[] args) {
    	ProductArrayExceptGivenIndex pa = new ProductArrayExceptGivenIndex();
        int arr[] = {10, 3, 5, 6, 2};
        int n = arr.length;
        System.out.println("The product array is : ");
       // pa.productArray(arr, n);
        productArray1(arr);
        System.out.println();
    }
}
 