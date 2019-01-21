package AProgramsPorblems;

import java.util.*;

public class ArrayMaxValueNumber {
	public static void main(String args[]) {
		int[] arr={4,6,7,9,0};
	//	String maxnum = new String();
		findNumber(arr);

	}

	public static void findlar(int arr[]) {
		String[] strA = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			strA[i] = String.valueOf(arr[i]);

		}

		Arrays.sort(strA, new Comparator<String>() {

			@Override
			public int compare(String o2, String o1) {
	
				return (o1 + o2).compareTo(o2 + o1);

			}
		});

		System.out.println(Arrays.toString(strA));
		StringBuffer sf = new StringBuffer();
		for (String s : strA) {
			sf.append(s);

		}
		//System.out.println(sf);

	}

	public static void findNumber(int arr[]) {
		String[] arr1 = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = String.valueOf(arr[i]);
		}
		Arrays.sort(arr1, new Comparator<String>() 
				{

			public int compare(String a, String b) {
				return (b + a).compareTo(a + b);
			}
		});
		StringBuilder sb = new StringBuilder();
		for (String s : arr1)
			sb.append(s);
		System.out.println(Arrays.toString(arr1));

	
}
}