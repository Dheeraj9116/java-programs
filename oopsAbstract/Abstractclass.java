package oopsAbstract;


abstract class User
{
	abstract void show();
	void play()
	{
		System.out.println("qwerty");
	}
}

public class Abstractclass extends User {

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("qwerty11");
	}
	public static void main(String[] args) {
		
		Abstractclass  a=new    Abstractclass();
		
		a.show();
		a.play();
		
	}

	
	
	
	
}
