package AQuestionAaaddddoooobe;
import java.util.Map;
import java.util.TreeMap;

public class _LargestIntegerMade {

	public static String HighestInter(String str) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		int k = Integer.parseInt(str);
		// int count=1;
		while (k > 0) {
			int r = k % 10;
			if (map.containsKey(r)) {
				map.put(r, map.get(r) + 1);
			} else {
				map.put(r, 1);
			}

			k = k / 10;

		}

		String result = "";
		for (int p : map.keySet()) {
			for (int i = 0; i < map.get(p); i++) {
				result = result + p;

			}

		}
		return result;
	}

	public static String HighestInter1(String str) {
		Character[] count = new Character[256];
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		for (int i = 0; i < str.length(); i++) {
			int k = str.charAt(i);
			count[k]++;
			// System.out.println((int)count[k]);

		}
		String str2 = "";
		for (int i = 60; i > 47; i--) {
			// System.out.println((int)count[i]);
			int l = (int) count[i];
			if ((int) count[i] > 0) {
				for (int j = 0; j < l; j++) {

					str2 = str2 + (char) i;
				}

			}

		}
		return str2;

	}
	
	
	public static String HighestInter2(String str) {
		int[] count = new int[10];
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
				int k=Character.getNumericValue(c);
				count[k]++;
		}
						
		String str2 = "";
		for (int i = count.length-1; i >0; i--) {
			if(count[i]>0)
			{

				for (int j = 0; j <count[i] ; j++) {

					str2 = str2 + i;
				}

			}
		}
		return str2;
		}
		
	



	public static void main(String[] args) {

		String r = HighestInter2("993459");
		System.out.println(r);
		/*
		 * for (int i = r.length() - 1; i >= 0; i--) {
		 * System.out.print(r.charAt(i));
		 * 
		 * }
		 */
	}
}