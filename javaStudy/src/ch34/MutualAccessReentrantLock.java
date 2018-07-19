package ch34;

import java.util.concurrent.locks.ReentrantLock;

class Counter3 {
	int count = 0;
	ReentrantLock criticObj = new ReentrantLock();

	public void increment() {
		criticObj.lock();
		try {
			count++;
		} finally {
			criticObj.unlock();
		}
	}

	public void decrement() {
		criticObj.lock();
		try {
			count--;
		} finally {
			criticObj.unlock();
		}
	}

	public int getCount() {
		return count;
	}
}

public class MutualAccessReentrantLock {
	public static Counter3 cnt = new Counter3();

	public static void main(String[] args) {
		Runnable task1 = () -> {
			for (int i = 0; i < 1000; i++)
				cnt.increment();
		};
	}// end of main
}// end of class
