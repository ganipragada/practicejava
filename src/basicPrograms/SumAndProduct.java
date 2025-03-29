package basicPrograms;

public class SumAndProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, product = 1;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			product = product * i;

		}
		System.out.println(sum +"\n"+ product);
	}

}
