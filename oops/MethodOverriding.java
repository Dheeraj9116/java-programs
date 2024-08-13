package oops;

class A
{
	 void show()
	{
		System.out.println("asdf qwerty");
	}
}


public class MethodOverriding extends A 
{
	void show()
	{
		System.out.println("sssssqqqx");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding q=new MethodOverriding();
		q.show();
		
	}

}
