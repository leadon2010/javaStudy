package ch17;

interface Printable {
	static void printLine(String str) {
		System.out.println(str);
	}

	default void print(String doc) {
		printLine(doc);
	}
}

class Printer implements Printable {
}

public class SimplePrinter {
	public static void main(String[] args) {
		String doc = "this is my report";
		Printable prn = new Printer();
		prn.print(doc);

		Printable.printLine(doc);
	}// end of main
}// end of class
