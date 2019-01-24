package AreadLogFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LineMatcher {

	public void findLines(String fileName) {
		int count = 0;
		Pattern regexp = Pattern.compile("Ram");
		Matcher matcher = regexp.matcher("");
		Path path = Paths.get(fileName);
		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING);
				LineNumberReader lineReader = new LineNumberReader(reader);) {
			String line = null;
			while ((line = lineReader.readLine()) != null) {
				matcher.reset(line); // reset the input
				if (matcher.find() == true) {
					/*
					 * String msg = "Line " + lineReader.getLineNumber() +
					 * " is bad: " + line; System.out.println(msg);
					 */
					count++;
				}
			}
			System.out.println(count);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	final static Charset ENCODING = StandardCharsets.UTF_8;

	/** Test harness. */
	public static void main(String[] args) {

		LineMatcher lineMatcher = new LineMatcher();
		lineMatcher.findLines("D://log1.log");
		System.out.println("Done.");
	}
}