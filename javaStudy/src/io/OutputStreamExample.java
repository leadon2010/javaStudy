package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("src/io/write.txt");
		String txt = "Hello, World";
		byte[] data = txt.getBytes();
		fos.write(data);
		fos.flush();
		fos.close();

		FileInputStream fis = new FileInputStream("src/io/write.txt");
		int readByte;
		byte[] buf = new byte[2];
		while ((readByte = fis.read(buf)) != -1) {
//			System.out.print((char) readByte + " ");
//			System.out.println("readByte: " + readByte);
			for (byte b : buf) {
				System.out.print((char) b + " ");
			}
//			System.out.println();
		}
		fis.close();

	}
}
