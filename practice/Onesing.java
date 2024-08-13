package practice;

class Grandfather
{
	void sho()
	{
		System.out.println("son qwerty father");
		}
}

class Father extends Grandfather
{
	void show()
	{
		System.out.println("qwerty father");
		}
}

class Son extends Father
{
	void dis()
	{
		System.out.println("son qwerty");
	}
	
}


public class Onesing {

	public static void main(String[] args) {
		
		Son a=new Son();
		a.show();
		a.sho();
		a.dis();
	}
	
	
}
