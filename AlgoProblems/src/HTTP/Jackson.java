package HTTP;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson {

	
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException  {
		{

		/*	String jsonStr1 = "{\"todos\" :[ "
					+ "{  \"id\":11, \"title\":\"t1\", \"completed\":false},"
					+ "{  \"id\":2, \"title\":\"t2\", \"completed\":true},"
					+ "{  \"id\":3, \"title\":\"t3\", \"completed\":false}]}";
*/
		//	String jsonStr1="{\"todos\" :[{\"id\":1,\"title\":\"t1\",\"completed\":false},{  \"id\":2,\"title\":\"t2\", \"completed\":true},{  \"id\":3,\"title\":\"t3\",\"completed\":false}]}";

			String jsonStr1="{\"todos\" :[{\"id\":1,\"title\":\"t1\",\"completed\":false},"
					+ "{  \"id\":2,\"title\":\"t2\", \"completed\":true},"
					+ "{  \"id\":3,\"title\":\"t3\",\"completed\":false}]}";
			
			
			// isJSONValid(jsonStr1) ;

			ObjectMapper mapper = new ObjectMapper();
			 mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
			 false);
			todos object1 = mapper.readValue(jsonStr1, todos.class);
			
			for(int i=0;i<object1.gettodos().size();i++)
			{
			System.out.println(object1.gettodos().get(i).getId());
			}
		}
	} }
