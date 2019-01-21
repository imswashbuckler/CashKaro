package JSON;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonObject;


public class JSONArrayParsing {

	public static void main(String[] args) throws Exception
	  {
	  //  String jsonInput = "{\"JObjects\":{\"JArray1\":[{\"A\":\"a\",\"B\":\"b\",\"C\":\"c\"},{\"A\":\"a1\",\"B\":\"b2\",\"C\":\"c3\",\"D\":\"d4\",\"E\":\"e5\"},{\"A\":\"aa\",\"B\":\"bb\",\"C\":\"cc\",\"D\":\"dd\"}]}}";
	    String jsonInput = "{\"JArray1\":[{\"A\":\"a\",\"B\":\"b\",\"C\":\"c\"},{\"A\":\"a1\",\"B\":\"b2\",\"C\":\"c3\",\"D\":\"d4\",\"E\":\"e5\"},{\"A\":\"aa\",\"B\":\"bb\",\"C\":\"cc\",\"D\":\"dd\"}]}}";

	JSONObject outObj=new JSONObject(jsonInput);
	JSONArray jsonArray=outObj.getJSONArray("JArray1");
	    
	    for (int i = 0, size = jsonArray.length(); i < size; i++)
	    {
	      JSONObject objectInArray = jsonArray.getJSONObject(i);

	      // "...and get thier component and thier value."
	      String[] elementNames = JSONObject.getNames(objectInArray);
	      System.out.printf("%d ELEMENTS IN CURRENT OBJECT:\n", elementNames.length);
	      for (String elementName : elementNames)
	      {
	        String value = objectInArray.getString(elementName);
	        System.out.printf("name=%s, value=%s\n", elementName, value);
	      }
	      System.out.println();
	    }
	  }
}