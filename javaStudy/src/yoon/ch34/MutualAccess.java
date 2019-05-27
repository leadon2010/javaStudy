package yoon.ch34;

class Counter {
	int count = 0;

	synchronized public void increment() {
		count++;
	}

	synchronized public void decrement() {
		count--;
	}

	public int getCount() {
		return count;
	}
}

public class MutualAccess {
	public static Counter cnt = new Counter();

	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for (int i = 0; i < 10; i++) {
				cnt.increment();
				System.out.println(Thread.currentThread().getName() + " " + i + " cnt: " + cnt.getCount());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable task2 = () -> {
			for (int i = 0; i < 10; i++) {
				cnt.decrement();
				System.out.println(Thread.currentThread().getName() + " " + i + " cnt: " + cnt.getCount());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(task1, "first");
		Thread t2 = new Thread(task2, "second");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(cnt.getCount());
	}// end of main
}// end of class
