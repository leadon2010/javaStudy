package lambda;

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		System.out.println("===========================");
		Thread thread = new Thread(runnable);
		thread.start();
		Thread thread1 = new Thread(runnable);
		thread1.start();
	}
}