package io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		File file1 = new File("src/io/ConsoleExample.java");
		FileReader fr = new FileReader(file1);

		int readByte;
		char[] cbuf = new char[100];
		while ((readByte = fr.read(cbuf)) != -1) {
			String text = new String(cbuf, 0, readByte);
			System.out.print(text);
		}
		fr.close();
	}
}
