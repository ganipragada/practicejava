package wrapperClass;

public class BoxingAndUnboxing {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		int a = 10;
		// converting int to Integer wrapper class
		Integer in = new Integer(a);
		System.out.println(in);

		// convert integer to boxing
		Integer i = Integer.valueOf(a);
		System.out.println(i);
		// new version
		Integer m = a;
		System.out.println(m);
		
		// converting boxing to unboxing
		Integer inte = new Integer(20);
		int aa = inte.intValue();
		System.out.println(aa);
		//new version
		Integer m2=100;
		int m3 = m2;
		System.out.println(m3);

	}

}
