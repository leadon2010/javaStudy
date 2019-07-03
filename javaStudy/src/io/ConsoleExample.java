package io;

import java.io.Console;

public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();
		System.out.print("ID: ");
		String id = console.readLine();
		System.out.print("Passwd: ");
		char[] pw = console.readPassword();
		String strPw = new String(pw);

		System.out.println("------------------");
		System.out.println("id: " + id);
		System.out.println("pw: " + strPw);
	}
}
