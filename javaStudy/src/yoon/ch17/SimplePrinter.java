package yoon.ch17;

interface PrintableSS {
	static void printLine(String str) {
		System.out.println(str);
	}

	default void print(String doc) {
		printLine(doc);
	}
}

class PrinterSS implements PrintableSS {
}

public class SimplePrinter {
	public static void main(String[] args) {
		String doc = "this is my report";
		PrintableSS prn = new PrinterSS();
		prn.print(doc);

		PrintableSS.printLine(doc);
	}// end of main
}// end of class
