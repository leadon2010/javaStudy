package ch17;

interface Upper {
}

interface Lower {
}

interface PrintableM {
	String getContents();
}

class Report implements PrintableM, Upper {
	String conts;

	Report(String cons) {
		this.conts = cons;
	}

	@Override
	public String getContents() {
		return conts;
	}

}

class PrinterM {
	public void printContents(PrintableM doc) {
		if (doc instanceof Upper) {
			System.out.println(doc.getContents().toUpperCase());
		} else if (doc instanceof Lower) {
			System.out.println(doc.getContents().toLowerCase());
		} else {
			System.out.println(doc.getContents());
		}
	}
}

public class MakerInterface {
	public static void main(String[] args) {
		PrinterM prn = new PrinterM();
		Report doc = new Report("Simple Funny News~");
		prn.printContents(doc);
	}
}
