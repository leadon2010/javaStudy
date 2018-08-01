package ch17;

interface PrintableI {
	void printLine(String str);
}

class SimplePrinterI implements PrintableI {

	@Override
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinterI {
	public void printLine(String str) {
		super.printLine("start of multiLine...");
		super.printLine(str);
		super.printLine("end of multi....");
	}
}

public class InstanceofInterface {
	public static void main(String[] args) {
		PrintableI prn1 = new SimplePrinterI();
		PrintableI prn2 = new MultiPrinter();

		if (prn1 instanceof PrintableI)
			prn1.printLine("this is simple printer");
		System.out.println();

		if (prn2 instanceof PrintableI)
			prn2.printLine("this is multi printer");
	}
}
