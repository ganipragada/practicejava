package methods;

class Animal2 {
	void eat() {
		System.out.println("animal's eat many things");

	}

	void sound() {
		System.out.println("animals are doing deffirent sounds");
	}
}

class Cat2 extends Animal2 {
	void eat() {
		System.out.println("cat eat rabit");
	}

	void sound() {
		System.out.println("Cat sound meam meam meam");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		animalDetails(new Cat2());

	}
	static void animalDetails(Animal2 a) {
		if (a instanceof Cat2) {
			Cat2 d =(Cat2)a;
			d.eat();
			d.sound();
		}
		else {
			a.eat();
			a.sound();
		}
	}

}
