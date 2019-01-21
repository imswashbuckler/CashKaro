package concepts;

abstract class TestAbstract {
	private int superVal;

	TestAbstract(int k) {
		System.out.println("TestAbstract my value: " + k + " superVal: "
				+ superVal);

		this.superVal = k;

	}

	public void syso() {
		System.out.println("Test my value: " + superVal);

	}

}

public class Classconsturctor extends TestAbstract {
	Classconsturctor(int k) {
		super(k);
		System.out.println("Classconsturctor Test my value: " + k);

	}

	public static void main(String[] args) {

		Classconsturctor test = new Classconsturctor(10);
		test.syso();
	}

}
