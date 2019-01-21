package ADeafult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrmacombination {
	static Map<String, List<String>> map = new HashMap<String, List<String>>();

	public static void combination(String[] arr) {
		// Map<String,List<String>> map=new HashMap<String, List<String>>();

		for (int i = 0; i < arr.length; i++) {
			String arrchar = arr[i];
			char[] char1 = arrchar.toCharArray();
			Arrays.sort(char1);
			String sortedK = new String(char1);
			if (map.containsKey(sortedK)) {
				map.get(sortedK).add(arr[i]);

			} else {
				map.put(sortedK, new ArrayList<String>());
				map.get(sortedK).add(arr[i]);

			}

		}
	}

	public static void main(String[] args) {
		String[] input = { "ZAB", "RQP", "BAZ", "ABC", "ACB", "DEF", "PQR",
				"FED", "CAB" };
		combination(input);

		for (String k : map.keySet()) {
			List<String> str = map.get(k);
			System.out.println(str);

		}

	}
}
