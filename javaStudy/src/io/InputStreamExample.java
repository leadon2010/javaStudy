package io;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/io/hello.txt");
			byte[] buf = new byte[4];
			int i = fis.read(buf, 0, 2);
			System.out.println("Number of bytes read: " + i);
			for (byte b : buf) {
				char c = (char) b;
				if (b == 0)
					c = '-';
				System.out.println("Char read from buffer: " + c);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
