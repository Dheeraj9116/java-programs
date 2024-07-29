package interviewpurpose;

import java.util.Scanner;

public class Factorialcalc {

	public static void main(String[] args) {
		int i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter factorial of number:");
		int number=sc.nextInt();
		for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  

	}

