package AProgramsPorblems;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapwithDuplicateKeyAddon {

	static Map<String, String> map1 = new LinkedHashMap<String, String>();

	public static void Test(char[] key, String[] val) {

		int[] arr = new int[256];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;

		}
		for (int i = 0; i < key.length; i++) {
			if (map1.containsKey(String.valueOf(key[i]))) {
				// System.out.println(arr[key[i]]);
				arr[key[i]]++;

				map1.put(String.valueOf(key[i]) + '_' + (arr[key[i]]), val[i]);

			} else {

				map1.put(String.valueOf(key[i]), val[i]);
			}

		}

	}

	public static void main(String[] args) {

		char[] key = { 'A', 'B', 'C', 'D', 'D', 'F', 'A', 'D', 'F', 'A', 'A' };
		// char[] key={'A','B','C','D','E','F','G','I','J','K','L'};

		String[] val = { "V1", "V2", "V3", "V4", "V5", "V6", "V7", "V8", "V9",
				"V10", "V11‌​" };
		Test(key, val);

		for (String ch : map1.keySet()) {
			System.out.println(ch + "---" + map1.get(ch));

		}
	}
}
