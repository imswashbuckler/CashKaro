package HTTP;

import org.json.JSONObject;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Gson {

	public static void main(String[] args) {
		String jsonStr1 = "{\"todos1\" :[ "
				+ "{  \"id\":1, \"title\":\"t1\", \"completed\":false},"
				+ "{  \"id\":2, \"title\":\"t2\", \"completed\":true},"
				+ "{  \"id\":31, \"title\":\"t3\", \"completed\":false}]}";
		com.google.gson.Gson gson = new GsonBuilder().setPrettyPrinting()
				.create();
		todos object = gson.fromJson(jsonStr1, todos.class);
		System.out.println(object.gettodos().get(2).getId());
		
	

	}
}
