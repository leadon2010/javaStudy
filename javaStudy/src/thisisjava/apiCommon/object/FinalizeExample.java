package thisisjava.apiCommon.object;

class Counter {
	private int no;

	public Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
//		super.finalize();
		System.out.println(no + "번 객체의 finalize()가 실행됨.");
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
	}
}
