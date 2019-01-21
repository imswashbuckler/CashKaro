package AquestionAaamaaaaaazoooon;

public class AllzeroRight {

	public static void RightZero(int[] arr) {
		int i = 0;
		int l = arr.length - 1;
		while(i<l) {
			if (arr[i] == 0) {
				i++;

			} else if (arr[l]== 1) {
				l--;
			} else {
				int temp = arr[i];
				arr[i] = arr[l];
				arr[l] = temp;

			}

		}
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]);
		}

	}

	public static void main(String[] args) {
		
		int[] arr={1,0,0,0,0,0};
		RightZero(arr); 

	}

}
