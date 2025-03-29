package exceptionHandling;

import java.util.Iterator;

public class User {

	public static void main(String[] args) throws InterruptedException {
		// Mythread3 m3 = new Mythread3();
		// m3.start();
		Thread td = new Thread();
		td.start();
		Thread.sleep(1000);
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
			
		}

	}

}
