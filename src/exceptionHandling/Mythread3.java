package exceptionHandling;



public class Mythread3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Runable =" + i);
		}

	}

}
