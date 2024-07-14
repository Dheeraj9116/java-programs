package Sod;

import java.util.Scanner;

public class Sod {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
        num= input.nextInt();
        while(num!=0){
            sum += num % 10;
            num = num / 10;
        }
          System.out.println ("Sum of digits : " + sum);

	}

}
