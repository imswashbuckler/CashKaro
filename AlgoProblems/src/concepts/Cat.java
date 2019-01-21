package concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

public class Cat extends Animal {

	int a = 5;
	static int b1 = 11;

	
		static {
		System.out.println("Cat Static block : " + b1);
	}
	
	{
		System.out.println("CAT inst block:   " + a);
		a = 8;
	}

	Cat() {
		// super(0);
		System.out.println("CAT Constrcutor ");
		System.out.println("constr = " + a);
	}

	Cat(int f) {
		System.out.println("CAT Constrcutor Argu ");
	}

	
	// @Override
	public  void foo() {
		System.out.println("Cat foo");
		/*
		 * int maximum=10; int minimum=5; Random rn = new Random(); int range =
		 * maximum - minimum + 1; int n = rn.nextInt(range) + minimum;
		 * 
		 * System.out.println(n);
		 */
	}

	public static void main(String[] args) throws IOException {

		Animal an =new Cat();
		an.test12();
		
		// Animal a = new Animal(5);
		Animal b = new Cat(6);
		// Cat c = new Cat(4);
		// Animal d = new Cat();
		// Cat e = null;
		// a.foo(); // should not be done. Prints Animal
		b.foo(); // should not be done. Prints Animal because the declared type
		// of b is Animal
		// c.foo(); // should not be done. Prints Cat because the declared type
		// of
		// c is Cat
		// d.foo(); // should not be done. Prints Animal because the declared
		// type
		// of b is Animal
		// e.foo();
		System.out.println();
	}

}