package stream.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;

		fis = new FileInputStream("src/stream/io/test.jpg");
		bis = new BufferedInputStream(fis);

		fos = new FileOutputStream("src/stream/io/test1.jpg");

		int readByte;
		long start = System.currentTimeMillis();
		while ((readByte = bis.read()) != -1) {
			fos.write(readByte);
		}
		long end = System.currentTimeMillis();
		fos.flush();
		System.out.println("not used: " + (end - start) + " ms");
		fos.close();
		bis.close();
		fis.close();

		BufferedOutputStream bos = null;
		fis = new FileInputStream("src/stream/io/test.jpg");
		bis = new BufferedInputStream(fis);

		fos = new FileOutputStream("src/stream/io/test2.jpg");
		bos = new BufferedOutputStream(fos);

		start = System.currentTimeMillis();
		while ((readByte = bis.read()) != -1) {
			bos.write(readByte);
		}
		end = System.currentTimeMillis();
		bos.flush();
		System.out.println("used: " + (end - start) + " ms");
		bos.close();
		bis.close();
		fos.close();
		fis.close();

	}
}
