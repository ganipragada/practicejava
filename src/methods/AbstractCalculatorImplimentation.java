package methods;

public class AbstractCalculatorImplimentation extends AbstractCalculator {

	@Override
	public void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i + j);
	}

	@Override
	public void sub(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i - j);
	}

	@Override
	public void div(int i, int j) {
		System.out.println(i * j);

	}

	@Override
	public void mult(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i / j);
	}

}
