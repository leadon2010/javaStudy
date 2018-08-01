package ch17;

interface PrintableS {
	static void printLine(String str) {
		System.out.println(str);
	}

	default void print(String doc) {
		printLine(doc);
	}
}

class PrinterS implements PrintableS {

}

public class PrinterDriverS {
	public static void main(String[] args) {
		String doc = "this is my doc";
		PrintableS prn = new PrinterS();
		prn.print(doc);

		PrintableS.printLine("end of line");
	}
}
