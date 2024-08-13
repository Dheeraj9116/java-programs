package practice;

public class Palindrome {

	public static void main(String[] args) {
		int num=12321;
		int rev=0;
		int temp=num;
		int rem;
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("Reversed number is" +rev);
		if(rev==temp) {
		System.out.println("palindrome number");
	}else {
		System.out.println("noy palindrome");
	}
	}

}
