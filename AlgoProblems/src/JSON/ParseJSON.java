package JSON;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ParseJSON {
	static String json = "...";

	public static void main(String[] args) throws JSONException, IOException {

		BufferedReader br = new BufferedReader(new FileReader("Ram.json"));
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = br.readLine()) != null) {
			// System.out.println(line);
			System.out.println();
			result.append(line);
		}
		String result1=result.toString();
		//System.out.println(result1);
		JSONObject obj = new JSONObject(result1);
		String pageName = obj.getJSONObject("pageInfo").getString("pageName");

		System.out.println(pageName);

		JSONArray arr = obj.getJSONArray("posts");
		for (int i = 0; i < arr.length(); i++) {
			String post_id = arr.getJSONObject(i).getString("post_id");
			System.out.println(post_id);
		}
	}
}