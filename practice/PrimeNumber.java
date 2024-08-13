package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();		
		
		int count=0;
		if(num<=1)
		{
			System.out.println("is not prime");
			return;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num % i== 0)
			count++;	
		}
		if(count>1)
		{
			System.out.println("is not prime number");
		}else {
			System.out.println("is prime number");
		}
	}

}
