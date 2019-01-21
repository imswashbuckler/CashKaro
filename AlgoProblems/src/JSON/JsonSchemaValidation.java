package JSON;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonSchemaValidation {
	
	public static void main(String[] args) {
		JSONObject jsonSchema = new JSONObject(
			      new JSONTokener(JSONSchemaTest.class.getResourceAsStream("/schema.json")));
			    JSONObject jsonSubject = new JSONObject(
			      new JSONTokener(JSONSchemaTest.class.getResourceAsStream("/product_invalid.json")));
			     
			    Schema schema = SchemaLoader.load(jsonSchema);
			    schema.validate(jsonSubject);
		
		
	}

}
