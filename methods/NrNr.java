package methods;

import java.util.Scanner;

public class NrNr {

	public static void main(String[] args) {
		
		NrNr obj=new NrNr();
		
		obj.areaOfRectangle();

	}
	
	public void areaOfRectangle() {
		int length,bredth;
		double area;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		length=sc.nextInt();
		System.out.println("enter the breadth:");
		bredth=sc.nextInt();
		area=length*bredth;
		System.out.println(area);
		
	}
	
	
	
	
	

}
