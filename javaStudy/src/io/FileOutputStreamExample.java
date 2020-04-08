package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		File file = new File("src/io/test.jpg");
		File file1 = new File("src/io/test1.jpg");

		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(file1);
			int readByte;
			byte[] buf = new byte[100];
			while ((readByte = fis.read(buf)) != -1) {
				fos.write(buf, 0, readByte);
			}
			fis.close();
			fos.flush();
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
