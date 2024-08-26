package exception;

import java.util.Scanner;

public class Throw {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		try {
	checkage(age);
		}
		catch(Exception e)
		{
		System.out.println("caught exception:"+e.getMessage());	
		}
	}
static void checkage(int age)
{
	if(age<18)
	{
		throw new IllegalArgumentException("not eligable");}
		else
		{ System.out.println("elgible");}
	
}
}
