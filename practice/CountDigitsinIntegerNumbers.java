package practice;

public class CountDigitsinIntegerNumbers {

	public static void main(String[] args) {
		long num=29845315;
		int count =0,num2=298453;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of digits:"+count);
		String res=Integer.toString(num2);
		System.out.println(+res.length());

	}

}
