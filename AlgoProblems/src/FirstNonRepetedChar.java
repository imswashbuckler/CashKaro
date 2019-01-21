import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetedChar {

	//One way to do
	public static char FirstNonRepetedCharinString(String str) {

		char[] charA = str.toCharArray();
		char k = 0;
		int count = 1;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charA.length; i++) {
			if (map.containsKey(charA[i])) {
				map.put(charA[i], count + 1);
			} else {
				map.put(charA[i], count);
			}

		}

		for (Character ch : map.keySet()) {
			if (map.get(ch) == 1) {
				k = ch;
				break;

			}

		}
		return k;

	}

	// Second way to do
	public static void FirstNonRepetedCharinString1(String str) {

		for (int i = 0; i < str.length(); i++) {
			boolean bool = true;
			char ch = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (i == j)
					continue;
				if (str.charAt(j) == ch) {
					bool = false;
					break;
				}
			}
			if (bool) {
				System.out.println(ch);
				break;
			}
		}

	}

	public static void main(String[] args) {

		String str="hhsfsdgndgf";
		//Firstway
	    char p=FirstNonRepetedCharinString(str);
		System.out.println(p);
		//Secondway
		FirstNonRepetedCharinString1(str);
		

	}
}