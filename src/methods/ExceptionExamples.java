package methods;

public class ExceptionExamples {

	public static void main(String[] args) {
		int a = 10, b;
		try {
			System.out.println("try block starts");
			b = a / 0;
			System.out.println("try block ends");
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("catch block starts");
		}
		System.out.println("i am gani");
		b = a / 0;
		System.out.println(b);

	}

}
