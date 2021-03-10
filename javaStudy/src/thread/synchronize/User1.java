package thread.synchronize;

public class User1 extends Thread {
	private Calculator cal;

	public void setCal(Calculator cal) {
		this.setName("User1");
		this.cal = cal;
	}

	public void run() {
		System.out.println("start User1.run()");
		cal.setMemory(100);
	}
}
