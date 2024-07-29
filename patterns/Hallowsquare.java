package patterns;

public class Hallowsquare {

	public static void main(String[] args) {
		 int row = 4;
	        int column = 5;

	        for (int i = 0; i < row; i++) {
	            if (i == 0 || i == row - 1) {
	                for (int j = 0; j < column; j++) {
	                    System.out.print("*");
	                }
	            } else {
	                System.out.print("*");
	                for (int j = 0; j < column - 2; j++) {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	}

}
