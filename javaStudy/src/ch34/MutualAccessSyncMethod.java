package ch34;

class Counter2 {
	int count = 0;

	synchronized public void increment() {
		System.out.println("in ++<block");
		count++;
		System.out.println("in ++>block");
	}

	synchronized public void decrement() {
		System.out.println("in --<block");
		count--;
		System.out.println("in -->block");
	}

	public int getCount() {
		return count;
	}
}

public class MutualAccessSyncMethod {
	static Counter2 cnt = new Counter2();

	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + " ----------------- out block");
				cnt.increment();
				System.out.println(Thread.currentThread().getName() + " ================= out block");
			}
		};
		Runnable task2 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + " ----------------- out block");
				cnt.decrement();
				System.out.println(Thread.currentThread().getName() + " ================= out block");
			}
		};
		Thread t1 = new Thread(task1, "first");
		Thread t2 = new Thread(task2, "second");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(cnt.getCount());
	}
}
