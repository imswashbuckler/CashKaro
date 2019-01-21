package SortingandMerging;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class bubbleSort 
{

	public void sortarray(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
			
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
					
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}}		
			}
		System.out.println(Arrays.toString(arr));
					}
public static void main(String[] args) {
	
	//Map<A_A ,A_A> mp=new HashedMap()<A_A,A_A>
    HashMap<String, Integer> map = new HashMap<>();

		int arr[] = { 71, 60, 35, 2, 45, 320, 5 };
		bubbleSort bobj = new bubbleSort();

		bobj.sortarray(arr);

		int arr1[] = { 570, 60, 35, 2, 45, 320, 0 };
		
		int min=arr1[0];
		int max=arr1[1];
		for(int i=0;i<arr1.length;i++)
			
		{
			if(arr1[i]>max)
			{
				max=arr1[i];
				
			}
			
			if(arr1[i]<min)
			{
				min=arr1[i];
				
			}
			
		}
		
		System.out.println("Max:"+max);

		System.out.println("min:"+min);
		
		
		
		
	}
}


