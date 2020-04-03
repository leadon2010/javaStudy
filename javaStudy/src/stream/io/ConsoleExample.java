package stream.io;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();

		System.out.print("input ID: ");
		String id = console.readLine();

		System.out.print("input Pwd: ");
		char[] pass = console.readPassword();

		String passwd = new String(pass);

		System.out.println("------------------");
		System.out.println(id);
		System.out.println(passwd);
		System.out.println("------------------");
	}
}
