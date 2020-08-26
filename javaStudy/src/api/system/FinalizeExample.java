package api.system;

class Counter {
	private int no;

	Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize() 실행됨.");
	}
}

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for (int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc();
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end of program.");
	}
}
