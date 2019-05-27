package yoon.ch26;

interface Printable3 {
	void print(String s);
}

public class Lambda3 {
	public static void main(String[] args) {
		Printable3 prn = (s) -> {
			System.out.println(s);
		};
		prn.print("what is lambda3");
	}
}
