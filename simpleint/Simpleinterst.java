package simpleint;

import java.util.Scanner;

public class Simpleinterst {
	public static void main(String args[])
	{
float p,t = 0,r,in;
Scanner my=new Scanner(System.in);
System.out.println("Enter Principle value:");
 p = my.nextFloat();
 System.out.println("Enter Time value:");
 r= my.nextFloat();
 System.out.println("Enter rate of interest:");
 r= my.nextFloat();
 in=(p * r * t) / 100; 
 System.out.println("Simple Interest = " +in);

	}
}
