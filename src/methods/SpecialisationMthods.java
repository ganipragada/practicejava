package methods;

interface Animal {
	void eat();

	void makesound();
}

class Dog implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eats biscuits");
	}

	@Override
	public void makesound() {
		System.out.println("bow bow bow");
		
	}
	

}
class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("cat eat's mouse");
		
	}

	@Override
	public void makesound() {
		System.out.println("miyam miyam");
		
	}
	
}

public class SpecialisationMthods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dogDetails(new Dog());
		catDetails(new Cat());
	}

	public static void dogDetails(Dog d) {
		d.eat();
		d.makesound();
		
	}
	public static void catDetails(Cat c) {
		c.eat();
		c.makesound();
	}

}
