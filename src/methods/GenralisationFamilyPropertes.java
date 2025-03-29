package methods;


interface Properties1 {
	void house();

	void car();

	void bike();

	void land();
}

class Brothers implements Properties1 {

	@Override
	public void house() {
		// TODO Auto-generated method stub
		System.out.println("Brother have donkada house");
	}

	@Override
	public void car() {
		System.out.println("brother have red colour car");

	}

	@Override
	public void bike() {
		System.out.println("brother have hounda bike");

	}

	@Override
	public void land() {
		System.out.println("Brother have a 1.2 acer");

	}

}

class Sisters implements Properties1 {

	@Override
	public void house() {
		System.out.println("sister have a tuni house");

	}

	@Override
	public void car() {
		System.out.println("sister have a blue car");

	}

	@Override
	public void bike() {
		System.out.println("sister have a scooty");

	}

	@Override
	public void land() {
		System.out.println("sister have a 3 acer land");

	}

}

public class GenralisationFamilyPropertes {

	public static void main(String[] args) {
		properties(new Brothers());
		properties(new Sisters());

	}

	static void properties(Properties1 b) {
		b.bike();
		b.car();
		b.land();
		b.house();

	}

	
}
