package thread;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread threadMain = Thread.currentThread();
		System.out.println("threadMain : " + threadMain.getName());

		Thread threadA = new ThreadA();
		System.out.println("thread: " + threadA.getName());
		threadA.start();

		Thread threadB = new ThreadB();
		System.out.println("thread: " + threadB.getName());
		threadB.start();
	}

}

class ThreadA extends Thread {

	ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + " contents");
		}
	}

}

class ThreadB extends Thread {
	ThreadB() {
		setName("ThreadB");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + " contents");
		}
	}

}