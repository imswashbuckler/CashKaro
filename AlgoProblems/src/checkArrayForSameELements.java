import java.util.Arrays;

public class checkArrayForSameELements {
	static boolean b = false;
	
	public static boolean SameElement1(int[] arr, int[] arr1) {
		boolean b=true;
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(arr1.length==arr.length)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=arr1[i])
				{
					b=false;
					break;
					
				}
				
			}
			
			
		}
		else
		{
			b=false;
			
		}
		return b;
		

	}

	public void SameElement(int[] arr, int[] arr1) {

		if (arr.length == arr1.length) {
			for (int i = 0; i < arr.length; i++) {
				int m = arr[i];
				b = false;

				for (int j = 0; j < arr1.length; j++) {
					if (m == arr1[j]) {
						b = true;

					}

				}

				if (b == false) {

					System.out.println("not same");
					break;

				} else {
					System.out.println("Same");

				}

			}
		} else {
			System.out.println("both have differtn sets");
		}

		// return b;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int arr1[] = { 7, 6, 5, 4, 3, 2, 1 };
		//checkArrayForSameELements obj = new checkArrayForSameELements();
		//obj.SameElement(arr, arr1);
		// System.out.println(b);
		//System.out.println(SameElement1(arr, arr1));
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
        boolean b =Arrays.equals(arr1, arr); 
        System.out.println(b);


	}

}
