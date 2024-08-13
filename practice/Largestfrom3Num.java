package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Largestfrom3Num {

	public static void main(String[] args) {
	
		//using else if condition
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter a number1:");
		//int num1=sc.nextInt();
		
		//System.out.println("enter a number2:");
		//int num2=sc.nextInt();
		//System.out.println("enter a number3:");
		//int num3=sc.nextInt();
		
//		if(num1>=num2&&num1>=num3)
//		{
//			System.out.println(num1+"is largest");
//		}else if(num2>=num1&&num2>num3)
//		{
//		System.out.println(num2+"is largest");
//		}
//		else
//		{
//			System.out.println(num2+"is largest");
//		}
		
		//using collections max() method and array list
	ArrayList<Integer> x=new ArrayList<>();
	x.add(12);
	x.add(22);
	x.add(54);
	System.out.println(Collections.max(x)+"is the largest number");	
	}

}
