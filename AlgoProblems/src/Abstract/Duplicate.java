package Abstract;

import java.util.Arrays;

public class Duplicate {
	
	public static void deletDuplicates(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])//{1,14,4,4,5,1,1,1,1};
				{
					while(arr[i]==arr[n-1])
					{
						n--;
					}
					
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					n--;
					
					
				}
			}
		}	
			
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]);
			}
			
		}
	
	public static int removeDuplicateElements(int arr[], int n){  
     
        Arrays.sort(arr);
        int j=0;
        for (int i=0; i<n-1; i++)
        {  
            if (arr[i] != arr[i+1])
            {
            	arr[j]=arr[i];
            	j++;
            }
            System.out.println(j);
           
          } 
              arr[j++]=arr[n-1];
        return j;
    }  
		public static void main(String[] args) {
			
			int arr[]={1,1,1,2,2,4};
		//	deletDuplicates(arr);
			int n=arr.length;
			int k=removeDuplicateElements(arr,n);
			   for (int i=0; i<k; i++){  
		            System.out.print(arr[i]+",");
		        }  
		    
			
			
		}

	}
