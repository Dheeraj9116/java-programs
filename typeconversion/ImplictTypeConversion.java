package typeconversion;

public class ImplictTypeConversion {

	public static void main(String[] args) {
		char v='d';
		
		System.out.println(v);
		int intVariable=v;
		
		System.out.println(intVariable);
		long longVariable=intVariable;
		System.out.println(longVariable);
		float floatVariable=longVariable;
		System.out.println(floatVariable);
		double doubleVariable=floatVariable;
		System.out.println(doubleVariable);


	}

}
