import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromUnsortedArray {

	static void removeDuplicates(int[] arrd) {

		int leng = arrd.length;
		System.out.println(Arrays.toString(arrd));

		for (int i = 0; i < leng; i++) {
			for (int j = i + 1; j < leng; j++) {
				if (arrd[i] == arrd[j]) {
					arrd[j] = arrd[leng - 1];
					leng--;
					j--;
				}
			}
		}

		for (int i = 0; i < leng; i++) {
			System.out.print(arrd[i] + "\t");
		}

	}

	public static void main(String[] args) {
		int[] ar1 = { 1, 1, 2, 9, 2, 1 };// array of
		int[] input = new int[] { 1, 1, 3, 3, 7, 7, 8, 9, 9, 9, 1 };
		removeDuplicates(ar1);

	}

}
