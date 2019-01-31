package ch26;

interface Printables {
	void print();
}

class Paper {
	private String con;

	public Paper(String s) {
		con = s;
	}

	public Printables getPrinter() {
		return new Printer();
	}

	private class Printer implements Printables {
		@Override
		public void print() {
			System.out.println(con);
		}
	}
}

public class InnerClassExample {
	public static void main(String[] args) {
		Paper p = new Paper("서류내용입니다");
		Printables prn = p.getPrinter();
		prn.print();

	}
}
