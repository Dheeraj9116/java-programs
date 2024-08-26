package exception;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Write {

	public static void main(String[] args) {
		
		String txt="qwerty keyboardwqcfhchcsqfhscxh";
		 Path fileName = Path.of("C:\\Users\\bablu\\eclipse-workspace\\sample\\src\\exception\\as.txt" );
try
{
	Files.writeString(fileName, txt);
	
	 String fileContent = Files.readString(fileName);
	 System.out.println(fileContent);
	
}
	catch(IOException e)
	{
		 System.err.println("An error occurred: " + e.getMessage());
	}		
	}
}
