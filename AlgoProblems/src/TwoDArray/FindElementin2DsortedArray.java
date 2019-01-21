package TwoDArray;

public class FindElementin2DsortedArray {

	public boolean FindElement(int[][] arr, int k)

	{
		int r = 0;
		int c = 0;
		int col = arr[0].length-1 ;
		int row=arr.length;
		
		boolean find = false;
	
		if (arr[r][col] == k) {
			find = true;
			return find;
		}

		while(r<=row-1 && col>=0)
		{
		 if (arr[r][col] > k ) 
		{
			col--;

		}
		else if (arr[r][col] < k ) 
		{
			r++;

		}

		else {
			
			find=true;
			break;
		}
			
	}
		return find;
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 4, 6, 8, 21 }, 
						{ 3, 29, 10, 12, 22 },
						{ 5, 11, 14, 19, 24 },
						{ 7, 13, 15, 20, 29 } };
		FindElementin2DsortedArray obj = new FindElementin2DsortedArray();
		System.out.println(obj.FindElement(arr,29));

	}
}
