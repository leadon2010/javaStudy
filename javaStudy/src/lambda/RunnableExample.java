package lambda;

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("a=>" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		System.out.println("===========================");
		Thread thread = new Thread(runnable);
		thread.start();

		thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("b=>" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		System.out.println("===========================");
	}
}
