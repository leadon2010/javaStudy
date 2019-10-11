package thread;

import java.awt.Toolkit;

class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Runnable task = new BeepTask();
		Thread thread = new Thread(task);
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("printing");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
