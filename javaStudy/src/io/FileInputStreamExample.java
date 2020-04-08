package io;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		File file = new File("src/io/FileExample.java");
		try {
			FileInputStream fis = new FileInputStream(file);
			int readByte;
			while ((readByte = fis.read()) != -1) {
				System.out.print((char) readByte);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
