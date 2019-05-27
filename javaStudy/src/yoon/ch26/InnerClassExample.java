package yoon.ch26;

@FunctionalInterface
interface Printables {
	void print();

//	void printf();
}

class Paper {
	private String con;

	public Paper(String s) {
		con = s;
	}

	public Printables getPrinter() {
		return new Printer();

	}

	class Printer implements Printables {
		@Override
		public void print() {
			System.out.println(con);
		}

//		@Override
//		public void printf() {
//			System.out.println();
//		}
	}

}

public class InnerClassExample {
	public static void main(String[] args) {
		Paper p = new Paper("서류내용입니다");
		Printables prn = p.getPrinter();
		prn.print();

	}
}
