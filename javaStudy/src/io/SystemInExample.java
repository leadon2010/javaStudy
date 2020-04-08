package io;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {
	public static void main(String[] args) throws IOException {
		System.out.println("Input: ");
		InputStream is = System.in;
		byte[] buf = new byte[16];
		int input;
		input = is.read(buf);
		System.out.println(input);
		String text = new String(buf, 0, input);
		System.out.println(text);
//		while ((input = is.read(buf)) != -1) {
//			System.out.println("i: " + input);
//			for (byte b : buf) {
//				System.out.print(b + " ");
//			}
//		}
//		System.out.println(input);
		is.close();
	}
}
