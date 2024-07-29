package oops;

     class Abc
     {
	
     }

    interface AnialEat  {
	   void eat();
	}
	interface AnialTravel {
	   void travel();
	}
	public class Hybridusinginterface extends Abc implements AnialEat, AnialTravel 
	{
	   public void eat() {
	      System.out.println("Animal is eating");
	   }
	   public void travel() {
	      System.out.println("Animal is travelling");
	   }

	   public static void main(String args[]) {
		   Multipleusinginterface a = new Multipleusinginterface();
	      a.eat();
	      a.travel();
	   }
	
}
