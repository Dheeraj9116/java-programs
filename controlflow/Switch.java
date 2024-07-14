package controlflow;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any vowel charcter:");
		char ch = sc.next().charAt(0);
	    switch(ch)  
	    {  
	        case 'a':   
	            System.out.println("it's Vowel");  
	            break;  
	        case 'e':   
	            System.out.println("it's Vowel");  
	            break;  
	        case 'i':   
	            System.out.println("it's Vowel");  
	            break;  
	        case 'o':   
	            System.out.println(" it's Vowel");  
	            break;  
	        case 'u':   
	            System.out.println("it's Vowel");  
	            break;  
	      
	        default:   
	            System.out.println("Consonant");  
	    }  

	}

}
