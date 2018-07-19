package ch34;

public class ExecutorDemo2 {
	public static void main(String[] args) {
		Runnable task1 = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + (5 + 7));
		};
		Runnable task2 = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + (7 - 5));
		};
		Runnable task3 = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + (7 * 5));
		};
	}// end of main
}// end of class
