package ch34;

class Counter1 {
	int count = 0;

	public void increment() {
		synchronized (this) {
			count++;
		}
	}

	public void decrement() {
		synchronized (this) {
			count--;
		}
	}

	public int getCount() {
		return count;
	}
}

public class MutualAccessSyncBlock {
	public static Counter1 cnt = new Counter1();

	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for (int i = 0; i < 100; i++) {
				cnt.increment();
				System.out.println(Thread.currentThread().getName() + " " + cnt.getCount());
			}
		};
		Runnable task2 = () -> {
			for (int i = 0; i < 100; i++) {
				cnt.decrement();
				System.out.println(Thread.currentThread().getName() + " " + cnt.getCount());
			}
		};
		Thread t1 = new Thread(task1, "first");
		Thread t2 = new Thread(task2, "second");

		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}// end of main
}// end of class
