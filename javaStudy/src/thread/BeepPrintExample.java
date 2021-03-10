package thread;

import java.awt.Toolkit;

class NewJob extends Thread {

	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new NewJob();
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
