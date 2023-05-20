package in.ineuron.main;

public class DisplayEvenNumbersThread implements Runnable {
	public void run() {

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.println("Even Number :: " + i);
		}
	}
}