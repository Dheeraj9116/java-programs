package Leapy;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		int rq;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter leap year");
        rq= input.nextInt();
        if ((rq % 4 == 0 && rq % 100 != 0) ||rq % 400 == 0) 
        { 
        System.out.printf("%d is a leap year.%n", rq);
        }else {
        System.out.printf("%d is not leap year.%n", rq);
	}
	}
}
