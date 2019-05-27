package yoon.ch17;

interface PrintableN {
	void print(String doc);

	// void printCMYK(String doc);
}

interface ColorPrintable extends PrintableN {
	void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable {

	@Override
	public void print(String doc) {
		System.out.println("Fromm 909Drv black & while ver");
		System.out.println(doc);
	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("From 909Drv color ver");
		System.out.println(doc);
	}

}

class Prn204Drv implements PrintableN {

	@Override
	public void print(String doc) {
		System.out.println("From 204Drv printer");
		System.out.println(doc);
	}

}

class Prn731Drv implements PrintableN {

	@Override
	public void print(String doc) {
		System.out.println("From 731Drv printer");
		System.out.println(doc);
	}

}

public class PrinterDriver {
	public static void main(String[] args) {
		String myDoc = "This is my report";

		PrintableN prn = new Prn204Drv();
		prn.print(myDoc);
		System.out.println();

		prn = new Prn731Drv();
		prn.print(myDoc);
		System.out.println();

		ColorPrintable pren = new Prn909Drv();
		pren.print(myDoc);
		pren.printCMYK(myDoc);

	}
}
