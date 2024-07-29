package oops;


public class Arthematicex
{
	void show()
	{
		System.out.println("Methodloverloading results:");
	}
	
	
	void show(int q)
	{
		System.out.println(q);
	}
	void show(float w,float e)
	{
		System.out.println("Result"+w+e);
	}
 void show(long a,long s,long d)
 {
	 System.out.println(a+s+d);
 }
 void show(double r, double t,double y,double u)
 {
	 System.out.println(r+t+y+u);
 }
	void show(String a,String b)
	   {
	   	System.out.println(a+b);
	   }




public static void main(String[] args) {
	
	Arthematicex   qw=new   Arthematicex();
	qw.show();
	qw.show(0);
	qw.show(0,0);
	qw.show(0, 0, 0);
	qw.show(0, 0, 0, 0);
	qw.show("asdf", "ghjkl");
	
}

}












