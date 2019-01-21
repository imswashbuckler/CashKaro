package AProgramsPorblems;

public class MaxProductinArray {
	
	public static void maxProductBybruteForce(int[] arr)
	{
		int m1=arr[0];
		int m2=arr[1];
		// 	int arr[] ={9,3,4,9,-10,-9};//{9,3,4,9,-10,-909,9999};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(m1*m2<arr[i]*arr[j])
				{
					m1=arr[i];
					m2=arr[j];
					
				}
				
				
			}
					
		
				
		}
		
		System.out.println("No are:"+ m1 +" "+m2);
	}
	
	
	public static void maxProduct(int[] arr)
	{
		int m1=arr[0];
		int m2=arr[1];
		int l1=arr[2];
		int l2=arr[3];
		// 	int arr[] ={9,3,4,9,-10,-9};//{9,3,4,9,-10,-909,9999};
		for(int i=0;i<arr.length;i++)
		{
			if(m1<m2)
			{
				m1=m2;
				m2=m1;	
				
			}
			if(arr[i]>m1 )
			{ 
				m2=m1;
				m1=arr[i];	
				
			}
			else if(arr[i]<=m1 && arr[i]>m2)
			{
			
				m2=arr[i];
			}
			else if(arr[i]<m1 && arr[i]<m2 && arr[i]<l1)
			{

				l2=l1;
				l1=arr[i];	
				
				
			}		
		}
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(l1);
		System.out.println(l2);
		
		if(m1*m2>l1*l2)
		{
			System.out.println("No are:  "+m1+","+m2);
		}
		else
		{
			
			System.out.println("No are:  "+l1+","+l2);
		}
		
	}
	
	public static void main(String[] args) 
	{

	int arr[] ={9,3,4,9,10,909,-9999,0};
	// maxProduct(arr);
	maxProductBybruteForce(arr);
		
		
	}

}
