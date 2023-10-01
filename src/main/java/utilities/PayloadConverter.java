package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayloadConverter {

	public static String resourceFolderPath="E:\\Study new\\AssignmentGitHub\\src\\main\\java\\resources\\";
	public static String generatePayload(String fileName) throws IOException
	{
		String filePath=new String(resourceFolderPath+fileName);
		String payload=new String(Files.readAllBytes(Paths.get(filePath)));
		return payload;
	}
}
