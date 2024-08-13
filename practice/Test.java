package practice;

public class Test {
	
	static int fun()
	{
		//Local variables in methods are created each time the method is invoked and are destroyed when the method completes. Since they are specific to each invocation,
		//the concept of static does not apply to them.
		int x=0;
		return ++x;
	}
	
	public static void main(String[] args)
	{
		System.out.println(fun());
	}

	

}
