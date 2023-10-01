package base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BaseClass 
{
	public static final String baseURI="https://api.github.com";
	public static RequestSpecification reqspecForCreatingARepo;
	public static RequestSpecification reqspecForReadingARepo;
	public static RequestSpecification reqspecForUpdatingARepo;
	public static RequestSpecification reqspecForDeletingARepo;
	public static Response responseOfCreatingARepo;
	public static Response responseOfUpdatingARepo;
	public static Response responseOfReadingARepo;
	public static Response responseOfDeletingARepo;
	
	public static Response getResponseOfCreatingRepo(String Token, String completeURL, String requestBody)
	{
		RestAssured.baseURI=baseURI;
		reqspecForCreatingARepo=RestAssured.given().body(requestBody);
		reqspecForCreatingARepo.header("Accept", "application/vnd.github+json");
		reqspecForCreatingARepo.header("Authorization", "Bearer "+Token);
		responseOfCreatingARepo=reqspecForCreatingARepo.when().post(completeURL);
		return responseOfCreatingARepo;
	}
	
	public static Response getResponseOfReadingRepo(String Token, String endpointURL)
	{
		RestAssured.baseURI=baseURI;
		reqspecForReadingARepo=RestAssured.given();
		reqspecForReadingARepo.header("Accept", "application/vnd.github+json");
		reqspecForReadingARepo.header("Authorization", "Bearer "+Token);
		responseOfReadingARepo=reqspecForReadingARepo.when().get(endpointURL);
		return responseOfReadingARepo;
	}
	
	public static Response getResponseOfUpdatingRepo(String Token, String completeURL, String requestBody)
	{
		RestAssured.baseURI=baseURI;
		reqspecForUpdatingARepo=RestAssured.given().body(requestBody);
		reqspecForUpdatingARepo.header("Accept", "application/vnd.github+json");
		reqspecForUpdatingARepo.header("Authorization", "Bearer "+Token);
		responseOfUpdatingARepo=reqspecForUpdatingARepo.when().patch(completeURL);
		return responseOfUpdatingARepo;
	}
	
	public static Response getResponseOfDeletingARepo(String Token, String completeURL)
	{
		RestAssured.baseURI=baseURI;
		reqspecForDeletingARepo=RestAssured.given();
		reqspecForDeletingARepo.header("Accept", "application/vnd.github+json");
		reqspecForDeletingARepo.header("Authorization", "Bearer "+Token);
		responseOfDeletingARepo=reqspecForUpdatingARepo.when().delete(completeURL);
		return responseOfDeletingARepo;
	}
	
}