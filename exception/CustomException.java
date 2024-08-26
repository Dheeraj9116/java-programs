package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class FileException extends Exception{
	FileException(String message,Throwable th)
	{
		super(message,th);
	}
}

public class CustomException {

	public static void main(String[] args) {
		FileInputStream myFile;
		try
	{
 myFile=new FileInputStream("E://myFolder//tempFile.txt");
	}catch(FileNotFoundException e)
	{
		try {
			throw new FileException("please check filename or path",e);
		}catch(Exception fileE) {
			fileE.getMessage();
			fileE.printStackTrace();
		}
	}
	}

}
