package basicPrograms;

public class PrimeCheck {
	
	public static void main(String[] args) {
		int number = 985;
		boolean isPrime = true;

		// Check from 2 to sqrt(number)
		for (int i = 2; i <=number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}
