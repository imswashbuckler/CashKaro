package Brills;

public class Overhiding {

	public void Overriding() {
		System.out.println("Overhiding");

	}

	public static void Hiding() {
		System.out.println("Overhiding");
	}
}

class Second extends Overhiding 
{

	public void Overriding() {

		System.out.println("Second");
	}

	public static void Hiding() {

		System.out.println("Second");
	}
}
