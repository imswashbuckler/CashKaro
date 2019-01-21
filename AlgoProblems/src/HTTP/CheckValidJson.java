package HTTP;

import java.io.IOException;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CheckValidJson {

	// A wild idea, try parsing it and catch the exception:

	public static boolean isJSONValid(String test) {
		try {
			new JSONObject(test);
		} catch (JSONException ex) {
			// edited, to include @Arthur's comment
			// e.g. in case JSONArray is valid as well...
			try {
				new JSONArray(test);
			} catch (JSONException ex1) {
				return false;
			}
		}
		return true;
	}

	public static boolean isJSONValidbyJackson(String jsonInString) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.readTree(jsonInString);
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	public static boolean isJSONValidByGson(String jsonInString) {
		Gson gson = new Gson();

		try {
			gson.fromJson(jsonInString, Object.class);
			return true;

		}

		catch (com.google.gson.JsonSyntaxException ex) {
			return false;

		}
	}

	public static void main(String[] args) {

		String validJsonString = "{ \"developers\": [{ \"firstName\":\"Linus\" , \"lastName\":\"Torvalds\" }, "
				+ "{ \"firstName\":\"John\" , \"lastName\":\"von Neumann\" } ]}";

		// Invalid String with a missing parenthesis at the beginning.
		String invalidJsonString = "\"developers\": [ \"firstName\":\"Linus\" , \"lastName\":\"Torvalds\" }, "
				+ "{ \"firstName\":\"John\" , \"lastName\":\"von Neumann\" } ]}";

		/*
		 * System.out.println(isJSONValid(validJsonString));
		 * System.out.println(isJSONValid(invalidJsonString));
		 * System.out.println(isJSONValidByGson(validJsonString));
		 * System.out.println(isJSONValidByGson(invalidJsonString));
		 */
		System.out.println(isJSONValidbyJackson(validJsonString));
		System.out.println(isJSONValidbyJackson(invalidJsonString));

	}

}
