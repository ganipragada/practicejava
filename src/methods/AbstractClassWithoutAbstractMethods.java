package methods;

abstract class AbstractClassWithoutAbstractMethods {
	static int a = 10;

	public static void run() {
		System.out.println("run");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println("main method");
		run();
	}

}
