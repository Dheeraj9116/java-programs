package Sod;

import java.util.Scanner;

public class Sod {

	public static void main(String[] args) {
		int m,n,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
        m= input.nextInt();
        while(m>0)
        {
        	n=m%10;
        	sum =sum+n;
        	m=m/10;
        }
System.out.println("sum of numbers"+sum);
	}

}
