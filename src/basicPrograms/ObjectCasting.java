package basicPrograms;

class A {
	void a1() {
		System.out.println("A.a1");
	}

	void b1() {
		System.out.println("A.b1");
	}
	void c1() {
		System.out.println("A.c1");
	}
}

class B extends A{
	void a1() {
		System.out.println("B.a1");
	}

	void d1() {
		System.out.println("B.d1");
	}
}

public class ObjectCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A p = new B();
		p.a1();
		p.b1();
		p.c1();
		B c = (B) p;
		c.a1();
		c.b1();
		c.c1();
		c.d1();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		
	
				
	}

}
