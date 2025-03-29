package exceptionHandling;

public class NotEligibleException extends RuntimeException {

	public NotEligibleException(String name, String msg) {
		System.out.println(name+ msg);
	}

}
