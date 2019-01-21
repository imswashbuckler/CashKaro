package JunitTestFunctions;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class JunitTestCases {

	private DistinctWord distinctWork;

	@Before
	public void setup() {
		distinctWork = new DistinctWord();
	}

	@Test
	public void testWithFewCommonRecords() {

		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("ABCD");
		l1.add("DEF");
		l1.add("PQR");
		l1.add("JKL");
		l1.add("MNO");
		l1.add("MNO");
		l1.add("GHI");

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("PQR");
		l2.add("ABC");
		l2.add("DEF");
		l2.add("GHI");
		l2.add("STU");
		l2.add("ABC");
		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("PQR");
		expectedResult.add("DEF");
		expectedResult.add("GHI");

		ArrayList<String> result = distinctWork.getCommonWords(l1, l2);
		System.out.println(result);
		Assert.assertEquals(result, expectedResult);

	}
	@Test
	public void testWithAllCommonRecords() {

		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("ABC");
		l1.add("DEF");
		l1.add("GHI");

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("ABC");
		l2.add("DEF");
		l2.add("GHI");

		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("ABC");
		expectedResult.add("DEF");
		expectedResult.add("GHI");

		ArrayList<String> result = distinctWork.getCommonWordsByBruteForce(l1, l2);
		System.out.println(result);
		Assert.assertEquals(result, expectedResult);

	}
	@Test()
	
	 public void testWithNoCommonRecords() {

		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("ABC");
		l1.add("DEF");
		l1.add("GHI");

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("KLM");
		l2.add("NOP");
		l2.add("RST");

		ArrayList<String> expectedResult = new ArrayList<String>();
		
		ArrayList<String> result = distinctWork.getCommonWordsByBruteForce(l1, l2);
		System.out.println(result);
		Assert.assertEquals(result, expectedResult);

	}
	
	
	@Test()
	
	 public void testWithCommonRecordAlsoDuplicate() 
	{

		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("ABC");
		l1.add("DEF");
		l1.add("ABC");

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("ABC");
		l2.add("NOP");
		l2.add("RST");

		ArrayList<String> expectedResult = new ArrayList<String>();
		expectedResult.add("ABC");
		
		ArrayList<String> result = distinctWork.getCommonWordsByBruteForce(l1, l2);
		System.out.println(result);
		Assert.assertEquals(result, expectedResult);

	}


}