import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnagramCombinations {

	public static void AnagramSplit(String[] arr) {
		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			char[] chArr = str.toCharArray();
			Arrays.sort(chArr);
			String sortedK = new String(chArr);

			if (map.containsKey(sortedK)) {
				map.get(sortedK).add(arr[i]);

			}

			else {
				map.put(sortedK, new ArrayList<String>());
				map.get(sortedK).add(arr[i]);

			}

		}

		for (String k : map.keySet()) {
			System.out.println(map.get(k));

		}

	}

	public static void main(String[] args) {
		String[] input = { "ZAB", "RQP", "BAZ", "ABC", "ACB", "DEF", "PQR",
				"FED", "CAB" };
		AnagramSplit(input);

		String b = "ramn";
		String b1 = "nram";
		char[] n = b.toCharArray();

		char[] n1 = b1.toCharArray();

		Arrays.sort(n);
		Arrays.sort(n1);

		String t = new String(n);
		String t1 = new String(n1);
		if (t1.equals(t)) {
			System.out.println("ana");
		} else {
			System.out.println("no ana");
		}

	}

}