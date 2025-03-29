package multiThreading;

public class MyThreas2 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("jai sri ram");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.start();
		Thread.sleep(500);
		MyThreas2 mt2 = new MyThreas2();
		mt2.start();
	}
}
