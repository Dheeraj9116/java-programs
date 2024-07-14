package controlflow;

public class Foreach {

	public static void main(String[] args) {
		int[] numbers = {3, 4, 5, -5, 0, 12};
		   int sum = 0;

		   // for-each loop is used to iterate through elements of arrays and collections
		   //iterating through each element of the array 
		   for (int number: numbers) {
		     sum += number;
		   }
		  
		   System.out.println("Sum = " + sum);

	}

}
