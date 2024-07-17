package methods;

public class Samediffparameters {

	
	// same method with different parameters
	public static void adda(int a)
	{
		System.out.println("Ar"+a);
	}
	public static  void adda(int a,int b)
	{
		System.out.println("Arg:"+a+"and"+b);
	}
	public static void main(String[] args) {

		adda(45);
		adda(76,46);
		
	}

}
