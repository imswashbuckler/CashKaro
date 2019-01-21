package AProgramsPorblems;

import java.util.HashMap;
import java.util.Map;

public class Test {

	static void changeagain(int count) {
		count++;
	}

	public static void changea(Integer a) {
		a = 10;
	}

	static void changeagainS(String count1) {
		count1 = count1 + 1;
	}

	public static void changeaS(String b) {
		b = "def";
	}

	public static void changeMap(Map<String, String> abc) {
		abc.put("abc", "changed");
	}

	public static void main(String[] args) {

		int a = 5;
		changea(a);
		System.out.println("First output" + a);
		changeagain(a);
		System.out.println("Second output" + a);
		String b = "abc";
		changeaS(b);
		System.out.println("First output:     " + b);
		changeagainS(b);
		System.out.println("Second output:    " + b);
	
		Map<String, String> abc = new HashMap<>();
		abc.put("abc", "toStart");
		
		changeMap(abc);
		
		System.out.println("Value " + abc.get("abc"));

	}

}
