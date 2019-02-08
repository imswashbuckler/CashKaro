package concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StringLiteral {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("D:/AAA.txt");

		int ascii;
		StringBuffer strContent = new StringBuffer("");

		while ((ascii = fin.read()) != -1) {

			strContent.append((char) ascii);
		}

		System.out.println("DF" + strContent);
		String jsonString1 = "{\"name\":\"Mahesh\", \"age\":21,\"money\":100}";

		String jsonString = "{\"name\" : \"Ronaldo\",\"sport\":\"soccer\",\"age\" : "
				+ "25,\"id\" : \"121\",\"lastScores\" : [ 2, 1, 3, 5, 0, 0, 1, 1 ]}";
		/*
		 * Gson g1 = new Gson(); StringLiteral p = g1.fromJson(jsonString,
		 * StringLiteral.class);
		 * 
		 * 
		 * 
		 * String str = g1.toJson(p); System.out.println(str);
		 */

		String a1 = new String("xyz");
		String a2 = new String("xyz");
		// syso(a1 == a2);
		String a = "Test";
		String b = "Test2";
		System.out.println(a + b);

		String c = "Test";
		String d = c + "Test2";
		String e = "TestTest2";
		System.out.println(d == e);

		String f = "Test3";
		String g = "Test4";
		String h = "Test5";
		String result = f + g + h;
		System.out.println(result);

		String[] arr = { "test1", "test2", "test3" };
		String i = "test1";

		String s = "abc";

		StringBuffer sb = new StringBuffer("Test");

		StringBuffer sb1 = new StringBuffer("Test");

		System.out.println(sb1.append(sb));

		if (arr[0] == i) {
			System.out.println("done");
		} else {
			System.out.println("not done");
		}

	}

}
