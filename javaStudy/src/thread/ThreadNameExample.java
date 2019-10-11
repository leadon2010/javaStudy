package thread;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());

		Thread threadA = new ThreadA();
		System.out.println("Thread: " + threadA.getName());
		threadA.start();

		Thread threadB = new ThreadB();
		System.out.println("Thread: " + threadB.getName());
		threadB.start();
	}
}

class ThreadA extends Thread {
	ThreadA() {
		setName("ThreadA");
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadB extends Thread {
	ThreadB() {
		setName("ThreadB");
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
