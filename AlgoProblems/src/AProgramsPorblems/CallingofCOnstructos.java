package AProgramsPorblems;

import java.util.ArrayList;

public class CallingofCOnstructos extends _AANN {

	CallingofCOnstructos() {

		// super();	

		System.out.println("__NonAbs");

	}

	public static void main(String[] args) {
		CallingofCOnstructos a = new CallingofCOnstructos();
	}
}

class _AANN extends _AANN1 {
	_AANN() {
		System.out.println("_AANN");

	}

}

class _AANN1 {
	_AANN1() {
		System.out.println("_AANN1");

	}

}

interface ITest {
	void Test();
}

interface ITest2 {
	void Test();
}

class Student implements ITest, ITest2 {
	public void Test() {
		System.out.println("ITest.Test");
	}

	void main(String[] args) {

		Student cls = new Student();
		cls.Test();
	}

}
