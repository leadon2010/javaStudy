package ch17;

interface PrintableP {
	void print(String doc);

	default void printCMYK(String doc) {
	};
}

class Prn731DrvP implements PrintableP {

	@Override
	public void print(String doc) {
		System.out.println("From 731Drv printer");
		System.out.println(doc);
	}

}

class Prn909DrvP implements PrintableP {

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

public class PrinterDriver2 {
	public static void main(String[] args) {
		String myDoc = "This is my report";

		PrintableP prn1 = new Prn909DrvP();
		prn1.print(myDoc);
		prn1.printCMYK(myDoc);
		System.out.println();

		PrintableP prn2 = new Prn731DrvP();
		prn2.print(myDoc);
		prn2.printCMYK(myDoc);
		System.out.println();

	}
}
