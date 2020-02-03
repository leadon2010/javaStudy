package thisisjava.lambda.examples;

interface Printable1 {
	void print(String s);
}

class Printer implements Printable1 {
	public void print(String s) {
		System.out.println(s);
	}
}

public class Third {
	public static void main(String[] args) {
		Printable1 prn = (s)-> System.out.println(s);//new Printer();
		prn.print("Sample test");
	}
}
