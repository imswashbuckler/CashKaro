package comperator;

import java.util.HashMap;
import java.util.Map;

public final class test11 {
	test11(String a){}

	private char value[];

	public boolean equals(test11 anObject) {
		if (this == anObject) {
			return true;
		}
		if (anObject instanceof test11) {
			test11 anotherString = (test11) anObject;
			int n = value.length;
			if (n == anotherString.value.length) {
				char v1[] = value;
				char v2[] = anotherString.value;
				int i = 0;
				while (n-- != 0) {
					if (v1[i] != v2[i])
						return false;
					i++;
				}
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		test11 a = new test11("ABC");
		test11 a1 = new test11("ABC");
		String b = "vde";
		String c = "vde";
		String s1 = new String("Test");
		String s2 = new String("Test");
		//System.out.println(a.equals(a1));
		System.out.println(a == a1);
		System.out.println(b.equals(c));
		System.out.println(b == c);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(a.hashCode() + "  " + a1.hashCode());
		System.out.println(b.hashCode() + "   " + c.hashCode());
		System.out.println(s1.hashCode() + "  " + s1.hashCode());
	
	}

}
