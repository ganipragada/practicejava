package basicPrograms;

class A1 {
	static int age = 29;
	static String name = "gani";

	public static void main(String[] args) {
		System.out.println("a1 main");
	}
}

class A2 {
	static int age = 25;
	static String name = "raja";

	public static void main(String[] args) {
		System.out.println("a2 main");
	}
}

class MultiClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A1.name + " = " + A1.age);
		System.out.println(A2.name + " = " + A2.age);
		// A1.main(args);
		// A2.main(args);

	}

}
