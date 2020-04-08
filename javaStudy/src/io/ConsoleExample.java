package io;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();

		System.out.print("ID:");
		String id = console.readLine();

		System.out.print("Pass:");
		char[] cbuf = console.readPassword();
		String pass = new String(cbuf);

		System.out.println("--------");
		System.out.println(id);
		System.out.println(pass);
	}
}
