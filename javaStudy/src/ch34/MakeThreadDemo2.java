package ch34;

class Task1 extends Thread {
	public void run() {
		int n1 = 10;
		int n2 = 20;
		String name = Thread.currentThread().getName();
		System.out.println(name + ": " + (n1 + n2));
	}
}// end of Task

public class MakeThreadDemo2 {
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		Task1 t2 = new Task1();
		t1.start();
		t2.start();
		System.out.println("End " + Thread.currentThread().getName());
	}// end of main
}// end of class
