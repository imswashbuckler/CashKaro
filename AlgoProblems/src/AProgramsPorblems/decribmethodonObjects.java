package AProgramsPorblems;

import java.awt.List;
import java.util.ArrayList;

import org.seleniumhq.jetty9.security.MappedLoginService.Anonymous;

public class decribmethodonObjects {
	public void call() {

		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
				
	}

	public static void main(String[] args) {

		decribmethodonObjects b = new decribmethodonObjects() {
			public void call() {

				System.out.println("Test1");
			}

		};
		b.call();

		ArrayList<Integer> ls = new ArrayList<>();

		for (int i = 0; i < 2; i++) {

			ls.add(i);
		}

		ls.parallelStream().forEach(System.out::println);
	}

}