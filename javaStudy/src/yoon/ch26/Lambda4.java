package yoon.ch26;

interface Printable4 {
	void print(String s);
}

public class Lambda4 {
	public static void main(String[] args) {
		ShowString((s) -> {
			System.out.println(s);
		}, "what is lambda");
	}

	public static void ShowString(Printable4 p, String s) {
		p.print(s);
	}
}
