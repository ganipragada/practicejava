package methods;
interface C{
	void m1();
}

interface B{
	void m2();
}
interface A extends C,B{
void m3();
}
public class C1 implements A,C,B{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
}
