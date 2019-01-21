package Brills;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapWithDuplicateKey1 {

	static Map<String, String> map1 = new LinkedHashMap<String, String>();

	public static void clsDuplicateKey(String[] key, String[] val) {

		// Map<String, Integer> map2 = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < key.length; i++) {
			if (map1.containsKey(key[i]))
			{
				
				//map1.put(getFun(key[i]), val[i]);
				map1.put(getFun(key[i]), val[i]);

				
			} else {

				map1.put(key[i], val[i]);
			}

		}

	}

	public static String getFun(String key) {
		String temp = "";
		for (int i = 1; i <= map1.size(); i++) {
			temp = key + "_" + i;
			if (!map1.containsKey(temp))
				break;

		}
		return temp;

	}

	public static void main(String[] args) {

		String[] key = { "A", "B", "C", "D", "D", "F", "A", "D", "F", "A", "A" };
		// char[] key={'A','B','C','D','E','F','G','I','J','K','L'};

		String[] val = { "V1", "V2", "V3", "V4", "V5", "V6", "V7", "V8", "V9",
				"V10", "V11‌​" };
		clsDuplicateKey(key, val);

		for (String ch : map1.keySet()) {
			System.out.println(ch + "---" + map1.get(ch));

		}
	}
}
