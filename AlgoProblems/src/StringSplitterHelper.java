import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplitterHelper {
	
	private static final String SPACE = " ";

	public static List<String> splitStringByThreshold (String origString, int threshold) {
		if(origString == null || "".equals(origString))
			return null;
		
		int origLength = origString.length();
		if(origLength < threshold)
			return Arrays.asList(origString);
		else {
			// split string by white space and then append them to match the threshold limit
			String[] splittedArr = origString.split("\\s+");
			List<String> splittedList = new ArrayList<String>();
			StringBuffer buf = new StringBuffer();
			
			for(int i = 0; i < splittedArr.length; i++) {
				// if the current string length is greater than threshold,spill the buffer to the array list
				int currentLength = splittedArr[i].length();
				if(currentLength >= threshold) {
					buf.append(splittedArr[i].substring(0, threshold-1)).append(SPACE);
					resetBufferAndFlushContent(buf, splittedList);
					continue;
				}
				else {
					int currentBufferLength = buf.length();
					// + 1 for white space char
					if(currentBufferLength + 1 + currentLength > threshold) {
						resetBufferAndFlushContent(buf, splittedList);
					}
					buf.append(splittedArr[i]).append(SPACE);
				}
			}
			resetBufferAndFlushContent(buf, splittedList);
			return splittedList;
		}
	}
	
	private static void resetBufferAndFlushContent(StringBuffer buf, List<String> list) {
		list.add(buf.toString().trim());
		buf.delete(0, buf.length());
	}
	
	public static void main(String[] args) {
		String test = "16/70asdnkalaefblaebrlgbergasldgnasdfsf first floor Subhaash Nagar New Delhi ";
		List<String> splitsBy30Chars = splitStringByThreshold(test, 30);
		splitsBy30Chars.add("testStirng");
		System.out.println(splitsBy30Chars);
	}
}
