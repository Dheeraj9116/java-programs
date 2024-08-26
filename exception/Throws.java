package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throws {

	public static void main(String[] args) {
		
try
{
	readfile("C:\\Users\\bablu\\eclipse-workspace\\sample\\src\\exception\\as.txt" );
}
catch(IOException e)
{
	System.out.println("caught exception:"+e.getMessage());
}
	}

	
	static void readfile(String Filename) throws IOException
	
	{
		BufferedReader br=new BufferedReader(new FileReader(Filename));
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
	}
	
}
