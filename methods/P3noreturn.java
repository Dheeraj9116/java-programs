package methods;

public class P3noreturn {
	
	//with argument vo return type
	
			public static void main(String[] args) 
			{
				P3noreturn obj=new P3noreturn();	
				System.out.println(obj.aadd(21, 21));

			}
			
			
			public double aadd(int a,int b)

			{
				
				double c=a*b;
				return c;
			}
	

}
