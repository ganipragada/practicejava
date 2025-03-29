package methods;

public class ConstructorWithArgs {
	String name;
	int age;
	long phone;

	public ConstructorWithArgs(String na, int ag, long ph) {
		name = na;
		age = ag;
		phone = ph;

	}

	public void name() {
		String name = "raja";
		System.out.println(name);
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithArgs cwa = new ConstructorWithArgs("gani", 29, 873458475388838l);
		System.out.println(cwa.name + " " + cwa.age + " " + cwa.phone);
		cwa.name();
	}

}
