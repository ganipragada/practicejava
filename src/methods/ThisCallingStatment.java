package methods;

public class ThisCallingStatment {
	public ThisCallingStatment(int n, String whight) {
		this("this width is 55 inches", 100);
		System.out.println(n);
		System.out.println(whight);
	}
	public ThisCallingStatment(String widht, int n) {
		System.out.println(widht+", "+n);
	}
	public static void main(String[] args) {
		ThisCallingStatment tcs = new ThisCallingStatment(200, "this is");
	}

}
