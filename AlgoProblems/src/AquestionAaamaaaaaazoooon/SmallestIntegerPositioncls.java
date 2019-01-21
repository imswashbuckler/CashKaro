package AquestionAaamaaaaaazoooon;

public class SmallestIntegerPositioncls {

	public static int getSmallestIntegerPosition(int[] arr) {
		int pos = 0;
		for (int i = 0; i < arr.length ; i++) {
			if (arr[pos] > arr[i]) 
			{
				pos = i;
			}

		}
		return pos;

	}

	public static void main(String[] args) {
		int[] arr = { -1, 2, 3, 4, 50, 8,0 };
		int k = getSmallestIntegerPosition(arr);
		System.out.println(k);

	}

}
