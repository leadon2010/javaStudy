package thread.synchronize;

public class User2 extends Thread {
	private Calculator cal;

	public void setCal(Calculator cal) {
		this.setName("User2");
		this.cal = cal;
	}

	public void run() {
		System.out.println("start User2.run()");
		cal.setMemory(50);
	}
}
