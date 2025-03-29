package methods;

interface Properties {
	void house();

	void car();

	void bike();

	void land();
}

class Brother implements Properties {

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

class Sister implements Properties {

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

public class SpecialisationFamilyPropertes {

	public static void main(String[] args) {

		SpecialisationFamilyPropertes sfp = new SpecialisationFamilyPropertes();
	sfp.brotherProperties(new Brother());
	sfp.sisterProperties(new Sister());
	
	}

	void brotherProperties(Brother b) {
		b.bike();
		b.car();
		b.land();
		b.house();

	}

	void sisterProperties(Sister s) {
		s.bike();
		s.car();
		s.land();
		s.house();
	}
}
