package AreadLogFile;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class ReadTextAsString {
	public static String readFileAsString(String fileName) throws Exception {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		System.out.println(data.length());
		

		 String pattern = ".*Q[^u]\\d+\\..*";
	        String line = "Order QT300. Now!";
	        if (line.matches(pattern)) {
	            System.out.println(line + " matches \"" + pattern + "\"");
	        } else {
	            System.out.println("NO MATCH");
	        }
		return data;
	}

	public static void main(String[] args) throws Exception {
		String data = readFileAsString("D://log1.log");
	//	System.out.println(data);
	}
}