package in.ineuron.main;

public class TestApp {

	public static void main(String[] args) {

		DisplayEvenNumbersThread evenRunnable = new DisplayEvenNumbersThread();
		DisplayOddNumbersThread oddRunnable = new DisplayOddNumbersThread();

		Thread evenThread = new Thread(evenRunnable);
		Thread oddThread = new Thread(oddRunnable);

		evenThread.start();
		oddThread.start();
	}

}
