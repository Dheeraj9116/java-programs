package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		
		// Right Triangle Star Pattern
		int i,j,row=5;
		for( i=0; i<row; i++)   
		{   
		for( j=0; j<=i; j++)   
		{   
		System.out.print("$");   
		}   
		System.out.println();   
		}
	}

}
