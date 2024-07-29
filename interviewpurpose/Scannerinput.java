package interviewpurpose;

import java.util.Scanner;


public class Scannerinput {

	public static void main(String[] args) {
		 Scanner mObj = new Scanner(System.in);   
		    System.out.println("Enter username");

		    String userName = mObj.nextLine();   
		    System.out.println("Username is: " + userName); 
	}

}
