package stream.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws IOException {
		long start = 0, end = 0;
		FileInputStream fis = new FileInputStream("src/stream/io/test.jpg");
		start = System.currentTimeMillis();
		while (fis.read() != -1) {
		}
		end = System.currentTimeMillis();
		System.out.println("not used. " + (end - start) + " ms");

		FileInputStream fis2 = new FileInputStream("src/stream/io/test.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {

		}
		end = System.currentTimeMillis();
		System.out.println("used. " + (end - start) + " ms");
		
		fis.close();
		bis.close();
	}
}
