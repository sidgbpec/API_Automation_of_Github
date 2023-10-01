package utilities;

public class CompleteURL 
{
	public static final String baseURL="https://api.github.com";
	public static String getBaseURL() 
	{
		return baseURL;
	}
public static String getCompleteURL(String endpointURL)
	{
		return baseURL+endpointURL;
	}
}
