package yoon.ch17;

interface PrintableNew {
	public void print(String doc);
}

class SPrinterDriver implements PrintableNew {

	@Override
	public void print(String doc) {
		System.out.println("SamSung PrinterDriver");
		System.out.println(doc);
	}
}

class LPrinterDriver implements PrintableNew {

	@Override
	public void print(String doc) {
		System.out.println("LG PrinterDriver");
		System.out.println(doc);
	}
}

public class PrinterDrive {
	public static void main(String[] args) {
		String myDoc = "This is report";

		PrintableNew prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		prn = new LPrinterDriver();
		prn.print(myDoc);
	}
}
