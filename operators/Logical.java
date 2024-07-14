package operators;

public class Logical {

	public static void main(String[] args) {
		int x = 5;
	    //System.out.println(x > 3 && x < 10); //both 
	    
	    //System.out.println(x > 3 || x < 4); //single
		System.out.println(!(x > 3 && x < 10)); //reverse 
		
	}

}
