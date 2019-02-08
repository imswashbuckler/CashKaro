package concepts;

abstract class TestAbstract {
	private int superVal;

	TestAbstract(int k,int j) {
		System.out.println("TestAbstract my value: " + k + " superVal: "
				+ superVal);

		this.superVal = k;

	}
	TestAbstract()
	{}

	public void syso() {
		System.out.println("Test my value: " + superVal);

	}

}

public class Classconsturctor extends TestAbstract {


	Classconsturctor() {
		//super(k, j);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	/*	Classconsturctor test = new Classconsturctor(10);
		test.syso();
*/	}

}
