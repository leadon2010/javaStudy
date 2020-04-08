package io;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {
	public static void main(String[] args) throws IOException {
		System.out.println("Input: ");
		InputStream is = System.in;
		byte[] buf = new byte[10];
		int input;
		while ((input = is.read(buf)) != -1) {
			System.out.println("i: " +input);
			for (byte b : buf) {
				System.out.print(b + " ");
			}
		}
		System.out.println(input);
		is.close();
	}
}
