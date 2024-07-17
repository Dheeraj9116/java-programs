package methods;

import java.util.Scanner;

public class NaWr {
	public static void main(String args[]){
	NaWr obj=new NaWr();
	
	System.out.println(obj.areaOfRectangle());

}

public double areaOfRectangle() {
	int length,bredth;
	double area;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length:");
	length=sc.nextInt();
	System.out.println("enter the breadth:");
	bredth=sc.nextInt();
    return area=length*bredth;
//	System.out.println(area);
	
}


}
