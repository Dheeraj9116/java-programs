package exception;
import java.util.Scanner;
public class Exception1 {

	public static void main(String[] args) throws Exception,NullPointerException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number :");
		
		int a=sc.nextInt();
		try
		{
		int div=45/a;
		String name="qwerty";
		System.out.println(div);
		}
		
		finally
		{
			System.out.println("closed");
		}
		
	}

}
