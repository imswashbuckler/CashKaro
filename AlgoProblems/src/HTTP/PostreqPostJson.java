package HTTP;

import java.io.StringWriter;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class PostreqPostJson {

	public void postRequestOms(StringWriter writer, int i)  {
		@SuppressWarnings("resource")
		//HttpClient httpClient = HttpClientBuilder.create().build();

		DefaultHttpClient httpClient = new DefaultHttpClient();
		try {
			HttpPost postrequest = new HttpPost("http://app04.preprod.hs18.lan:7004/api/1/oms/executeOmsCommand");
			postrequest.addHeader("content-type", "application/json");
			postrequest.addHeader("accept", "application/json");
			StringEntity entity = new StringEntity(writer.getBuffer().toString());
			postrequest.setEntity(entity);

			HttpResponse response = httpClient.execute(postrequest);
			// verify the valid error code first
			int statusCode = response.getStatusLine().getStatusCode();
			ResponseHandler<String> handler = new BasicResponseHandler();
			
			String output = handler.handleResponse(response);
			System.out.println(output);

			if (statusCode != 201 && statusCode != 204 && statusCode != 200)
			{
				throw new RuntimeException("Failed with HTTP error code : " + statusCode);
			}

			// Method 1
			JSONParser parser = new JSONParser();
			JSONObject json = (JSONObject) parser.parse(output);
			JSONObject omsCommandResult = (JSONObject) json.get("omsCommandResult");
			JSONObject result = (JSONObject) omsCommandResult.get("result");
			JSONObject response2 = (JSONObject) result.get("response");
			Object suborder = response2.get("suborderId");
			String subordername=suborder.toString();
			System.out.println(subordername);

	
			}
		catch(Exception ex)
		{}
}
}
	
	