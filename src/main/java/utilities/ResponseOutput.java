package utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseOutput {

	public static String value;
	public static String getValue(String key, String response)
	{
		JsonPath jp=new JsonPath(response);
		value=jp.get(key);
		return value;
	}
	
	public static int getStatusCode(Response response)
	{
		return response.getStatusCode();
	}
}
