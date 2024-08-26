package exception;

import java.io.FileWriter;
import java.io.IOException;

public class Write1 {

	public static void main(String[] args) throws IOException {
		
		
		String Text="asdfjkl";
		
		try
		{
		FileWriter qwe=new FileWriter("C:\\Users\\bablu\\eclipse-workspace\\sample\\src\\exception\\as.txt");
		qwe.write(Text);
		System.out.println(Text);
		qwe.close();
		System.out.println("file is created ss eith content");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
