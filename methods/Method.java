package methods;

 interface Method2 {
	
	
	void display();
	
		
}

 
 
interface Method1{
	
		void show();
	
		
	}



public class Method implements  Method2,Method1{
	public static void main(String[] args) {
	Method obj = new Method();
	obj.display();
	obj.show();
		
	}
	public void display() {
		System.out.println("hi ");
	}
	public void show() {
		System.out.println("hi123 ");
	}
	
}


