package lambda.example;

interface Printable {
	void print();
}

class Papers {
	private String con;

	public Papers(String s) {
		con = s;
	}

	public Printable getPrinter() {
		return new Printer();
	}

	// 멤버클래스 형태->로컬클래스 형태로 변경->익명클래스형태로 변경.
	private class Printer implements Printable {
		public void print() {
			System.out.println(con);
		};
	}
}

public class First {
	public static void main(String[] args) {
		Papers p = new Papers("print this");
		Printable prn = p.getPrinter();
		prn.print();
	}
}
