package practice;

import java.util.Scanner;

public class Amstrongnum {

	public static void main(String[] args) {
		int sum=0,res,temp;
		//int num=153;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			res=num%10;
			num=num/10;
			sum=sum+(res*res*res);
		}
		if(temp==sum)
			System.out.println(temp+"is arrmstrong number");
		else
			System.out.println(temp+"is not armstrong number");
	}

}
