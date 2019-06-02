package zone.study;

interface Printable {
	public void print(String doc);
}

class Printer {

//	@Override
//	public void print(String doc) {
//		System.out.print("black print ===> \t");
//		System.out.println(doc);
//	}

	public void blackPrint(String doc) {
		System.out.print("black print ===> \t");
		System.out.println(doc);
	}

}

class ColorPrinter {

//	@Override
//	public void print(String doc) {
//		System.out.print("Color Print ===>\t");
//		System.out.println(doc);
//	}

	public void blackPrint(String doc) {
		System.out.print("black print ===> \t");
		System.out.println(doc);
	}

	public void colorPrint(String doc) {
		System.out.print("Color Print ===> \t");
		System.out.println(doc);
	}

}

public interface PrinterableInterface {
	public static void main(String[] args) {
		// Printer prn = new Printer();
		ColorPrinter prn = new ColorPrinter();
		prn.blackPrint("Hello Java");
		prn.colorPrint("Hello Java");
	}
}
