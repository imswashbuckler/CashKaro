package AquestionAaamaaaaaazoooon;
public class LeadersInSeries {
	public static void LeadersInseries(int[] arr) {
		int size=arr.length;
		int max=arr[size-1];
		for(int i=size-2;i>=0;i--)
		{
			if(arr[i]>max)
			{
	            max = arr[i]; 
//              System.out.println(arr[i]);
	            System.out.print(max + " "); 

			}}}

	public static void main(String[] args) {
		int[] arr={16, 17, 4, 3, 25, 2}; 
		LeadersInseries(arr);
		

	}
}
