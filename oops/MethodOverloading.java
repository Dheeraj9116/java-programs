package oops;

public class MethodOverloading {
	 void show (int i)
	{
		System.out.println(i);
	}

   void show()
{
	System.out.println("aasda");
}
   
   void show(String a,String b)
   {
   	System.out.println(a+b);
   }
    void show(int a,int b)
    {
    	System.out.println("");
    }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
MethodOverloading o=new MethodOverloading();
o.show(12);
o.show();
o.show("qwer","asdf");
o.show(44, 55);
	
	}

}
