package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;
import pojoClasses.PojoForCreatingARepo;
import pojoClasses.PojoForUpdatingARepo;
import utilities.PayloadConverter;

public class GitHubTests 
{
	public static String Token=utilities.Authentication.getToken();
	public static String completeURL=utilities.CompleteURL.getCompleteURL("/user/repos");
	public static String requestBodyToCreateARepo;
	public static String requestBodyToUpdateARepo;
	public static Response responseOfCreatingARepo;
	public static Response responseOfUpdatingARepo;
	public static ObjectMapper objectMapper;
	public static String accountOwner;
	public static String nameOfRepo;
	public static Response responseOfReadingARepo;
	public static Response responseOfDeletingARepo;
	
	@Test(enabled=false)
	public static void testToCreateARepoWithoutPojo() throws IOException
	{
		requestBodyToCreateARepo=PayloadConverter.generatePayload("createARepo.json");
		responseOfCreatingARepo=base.BaseClass.getResponseOfCreatingRepo(Token, completeURL, requestBodyToCreateARepo);
		System.out.println(responseOfCreatingARepo.asPrettyString());
		int actualStatusCode=utilities.ResponseOutput.getStatusCode(responseOfCreatingARepo);
		Assert.assertEquals(actualStatusCode, 201);
	}
	
	@Test(priority=0)
	public static void testToCreateARepoWithPojo() throws IOException
	{
		PojoForCreatingARepo data=new PojoForCreatingARepo();
		String newName=data.getName()+Math.random();
		String newDescription=data.getDescription()+Math.random();
		data.setName(newName);
		data.setDescription(newDescription);
		objectMapper=new ObjectMapper();
		String requestBodyToCreateARepo=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		System.out.println("request body to create a repo: "+requestBodyToCreateARepo);
		responseOfCreatingARepo=base.BaseClass.getResponseOfCreatingRepo(Token, completeURL, requestBodyToCreateARepo);
		System.out.println(responseOfCreatingARepo.asPrettyString());
		int actualStatusCode=utilities.ResponseOutput.getStatusCode(responseOfCreatingARepo);
		Assert.assertEquals(actualStatusCode, 201);
	}
	
	@Test(priority=1)
	public static void testToReadARepo()
	{
		accountOwner=utilities.ResponseOutput.getValue("owner.login", responseOfCreatingARepo.asString());
		nameOfRepo=utilities.ResponseOutput.getValue("name", responseOfCreatingARepo.asString());
		String completeURLToReadARepo=utilities.CompleteURL.getCompleteURL("/repos/"+accountOwner+"/"+nameOfRepo);
		responseOfReadingARepo=base.BaseClass.getResponseOfReadingRepo(Token, completeURLToReadARepo);
		System.out.println(responseOfReadingARepo.asString());
		int actualStatusCode=utilities.ResponseOutput.getStatusCode(responseOfReadingARepo);
		Assert.assertEquals(actualStatusCode, 200);
	}
	@Test(priority=2)
	public static void testToUpdateARepo() throws JsonProcessingException
	{
		PojoForUpdatingARepo data=new PojoForUpdatingARepo();
		data.setDescription("updated through test case");
		String requestBody=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
		System.out.println("request body being used for updation: "+requestBody);
		String completeURLToUpdateARepo=utilities.CompleteURL.getCompleteURL("/repos/"+accountOwner+"/"+nameOfRepo);
		responseOfUpdatingARepo=base.BaseClass.getResponseOfUpdatingRepo(Token, completeURLToUpdateARepo, requestBody);
		System.out.println("after updation, response is "+responseOfUpdatingARepo.asString());
		int statusCode=utilities.ResponseOutput.getStatusCode(responseOfUpdatingARepo);
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test(priority=3)
	public static void testToDeleteARepo() throws JsonProcessingException
	{
		String completeURLToDeleteARepo=utilities.CompleteURL.getCompleteURL("/repos/"+accountOwner+"/"+nameOfRepo);
		responseOfDeletingARepo=base.BaseClass.getResponseOfDeletingARepo(Token, completeURLToDeleteARepo);
		int statusCode=utilities.ResponseOutput.getStatusCode(responseOfDeletingARepo);
		Assert.assertEquals(statusCode, 204);
	}
	
}
