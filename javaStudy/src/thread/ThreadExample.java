package thread;

import java.awt.Toolkit;

class NewThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
//			System.out.println("print : " + i);
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread = new Thread(new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("print : " + i);
					Toolkit toolkit = Toolkit.getDefaultToolkit();
//					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});
		thread.start();

		System.out.println("=================");

		for (int i = 0; i < 5; i++) {
			System.out.println("print Thread: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
