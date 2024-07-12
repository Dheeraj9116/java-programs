import java.util.Scanner;

public class SwitchCondition 
{

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
				
		System.out.println("enter first 3 days:");	
		String day=sc.next();
		switch(day)
		{
		case "Monday":
			System.out.println("tis is monday");
			
			break;
			
		case "Tuesday":
			System.out.println("tis is Tuesday");
		break;
			
			
			
		case "Wednesday":
			System.out.println("tis is wednesday");
		break;
			
		default:
			System.out.println("enter first 3 days of week");
		}
		
	}
}

