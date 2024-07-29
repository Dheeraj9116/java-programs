package interviewpurpose;
import java.util.Scanner;

public class ArithmeticCalculator {
	



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input first number
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        // Input second number
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        // Input operator
	        System.out.print("Enter the operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        // Variable to store the result
	        double result;

	        // Perform the chosen operation
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println(num1 + " + " + num2 + " = " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println(num1 + " - " + num2 + " = " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println(num1 + " * " + num2 + " = " + result);
	                break;
	            case '/':
	                // Handle division by zero
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println(num1 + " / " + num2 + " = " + result);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operator.");
	                break;
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}

	
	
	


