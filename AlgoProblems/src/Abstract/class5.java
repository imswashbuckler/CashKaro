package Abstract;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class class5 extends class4 {
    String name = "class5";

	class5() {

super(7);	
	System.out.println("kj");
	}

	public void t() throws ArithmeticException
	{
	    System.out.println("t1");
	
	}

	public static void main(String[] args) throws FileNotFoundException,SQLException {
		
		class4 b = new class5();
	
		System.out.println(b.name);
	b.t();
	}
}
