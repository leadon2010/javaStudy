package thread;

import java.awt.Toolkit;

class WorkThread extends Thread {

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

public class BeepPrintExample4 {
	public static void main(String[] args) {
		Thread thread = new WorkThread();
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("printing");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			;
		}
	}// end of main
}
