package ch34;

public class MakeThreadMultiDemo {
	public static void main(String[] args) {
		Runnable task1 = () -> {
			try {
				for (int i = 0; i < 20; i++) {
					if (i % 2 == 0)
						System.out.println(Thread.currentThread().getName() + " " + i + " ");
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Runnable task2 = () -> {
			try {
				for (int i = 0; i < 20; i++) {
					if (i % 2 == 1)
						System.out.println(Thread.currentThread().getName() + " " + i + " ");
					Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(task1, "First");
		Thread t2 = new Thread(task2, "Second");

		t1.start();
		t2.start();

	}// end of main
}// end of class
