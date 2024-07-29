package oops;
interface AnimalEat {
	   void eat();
	}
	interface AnimalTravel {
	   void travel();
	}
	public class Multipleusinginterface  implements AnimalEat, AnimalTravel 
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
