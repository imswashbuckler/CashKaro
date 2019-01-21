package Brills;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNG {
	
	private DistinctWord distinctWork;

	@BeforeTest
	public void setup() {
		distinctWork = new DistinctWord();
	}
	
	@Test
	public void testCommonWords()
	{
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("ABCD");
		l1.add("DEF");
		l1.add("GHI");
		l1.add("JKL");
		l1.add("MNO");
		l1.add("PQR");
		l1.add("MNO");

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("ABC");
		l2.add("DEF");
		l2.add("GHI");
		l2.add("PQR");
		l2.add("STU");
		l2.add("ABC");

		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("DEF");
		expectedResult.add("GHI");
		expectedResult.add("PQR");
		SoftAssert as = new SoftAssert();
		
		
		ArrayList<String> result = distinctWork.getCommonWords(l1, l2);
		Assert.assertEquals(result, expectedResult);
		
		
	}

}
