package ADeafult;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FindandReplaceText {

	public static void relaceText(String PathTextFile, String findtext,
			String replaceText) throws IOException, InterruptedException {
		File file = new File(PathTextFile);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = "", oldtext = "";
		while ((line = reader.readLine()) != null) {

			oldtext += line + "\r\n";

		}
		System.out.println(oldtext);
		reader.close();
		String newtext = oldtext.replaceAll(findtext, replaceText);
		FileWriter writer = new FileWriter(PathTextFile);
		writer.write(newtext);
		writer.close();

	}

	public static void main(String[] args) throws IOException,
			InterruptedException {

		String path = ".//DataFiles//Ram.txt";
		String findtext = "replaceText";
		String replString = "neText";
		relaceText(path, findtext, replString);

	}

}
