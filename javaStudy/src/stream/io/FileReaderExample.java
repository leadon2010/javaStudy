package stream.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src/stream/io/FileExample.java");
			int readChar;
			char[] cbuf = new char[100];
			while ((readChar = fr.read(cbuf)) != -1) {
				String str = new String(cbuf, 0, readChar);
				System.out.print(str);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
