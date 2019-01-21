package AProgramsPorblems;

public class SearchElementinArray {

	public int searchElement(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		boolean b = false;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			else if(arr[mid]<key)//{31,32,38,43,45,53,64,77};
			{
				low=mid+1;
				}
			else
			{
				high=mid-1;
				
			}

		}
		return -1;

	}

	public static void main(String[] args)
	{
		SearchElementinArray obj = new SearchElementinArray();
		int[] arr = {31,32,38,43,45,53,64,77};
		System.out.println(obj.searchElement(arr,45));
		

		
	}
}
