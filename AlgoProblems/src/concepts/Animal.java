package concepts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

// Static/NonStatic  call issue and does exception needed in 
// child class if defined in parent class
public class Animal {
	static int a = 10;

	static {
		System.out.println("Animal static block : " + a);
	}

	{
		System.out.println("Animal instance block:   " + a);
		a = 8;
	}

	Animal() {
		System.out.println("Animal Constructor ");

	}

	Animal(int m) {
		System.out.println("Animal constructor argu ");

	}

	public void test12() {
		System.out.println(" Animal test12");
	}

	void foo() throws FileNotFoundException {
		System.out.println("Animal foo");

		BufferedReader br = new BufferedReader(new FileReader(
				"D:\\AAAAAAA\\a\\File.txt"));
	}

}
