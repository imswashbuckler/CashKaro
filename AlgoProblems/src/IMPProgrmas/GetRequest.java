package IMPProgrmas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class GetRequest {

	public static void main(String[] args)
			throws UnsupportedOperationException, IOException {
		String url = "http://www.google.com/search?q=httpClient";

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		// add request header
		request.addHeader("accept", "application/json");
		request.addHeader("User-Agent", "USER_AGENT");
		HttpResponse response = client.execute(request);

		System.out.println("Response Code : "
				+ response.getStatusLine().getStatusCode());

		BufferedReader rd = new BufferedReader(new InputStreamReader(response
				.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}

		/*
		 * //*****************************************************************
		 * int statusCode = response.getStatusLine().getStatusCode();
		 * 
		 * ResponseHandler<String> handler = new BasicResponseHandler();
		 * 
		 * String output = handler.handleResponse(response);
		 * System.out.println(output);
		 * 
		 * if (statusCode != 201 && statusCode != 204 && statusCode != 200) {
		 * throw new RuntimeException("Failed with HTTP error code : " +
		 * statusCode); }
		 * 
		 * JSONParser parser = new JSONParser(); 
		 * JSONObject json = (JSONObject) parser.parse(output);
		 *  JSONObject omsCommandResult = (JSONObject) * json.get("omsCommandResult"); 
		 *  JSONObject result = (JSONObject)omsCommandResult.get("result");
		 *  JSONObject response2 = (JSONObject) result.get("response"); 
		 *  Object suborder =response2.get("suborderId"); 
		 *  String subordername=suborder.toString();
		 * System.out.println(subordername);
		 * suborderlist.add(suborder.toString());
		 */

	}

}
