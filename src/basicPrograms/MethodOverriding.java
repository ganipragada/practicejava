package basicPrograms;

class M1 {
	void water() {
		System.out.println("m1 gives  a Water");
	}

	void food() {
		System.out.println("m1 gives a food");
	}

	void place() {
		System.out.println("M1 gives a place ");
	}
}

class M2 extends M1 {
	void water() {
		System.out.println("m2 gives a water");
	}

	void food() {
		System.out.println("m2 gives a food");
	}
}

public class MethodOverriding extends M2 {
	void water() {
		String string = "i need a coll water";
		System.out.println(string);

	}

	public static void main(String[] args) {
		MethodOverriding a1 = new MethodOverriding();
		a1.food();
		a1.place();
		a1.water();

	}
}
