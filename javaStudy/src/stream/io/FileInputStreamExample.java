package stream.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) throws FileNotFoundException {
		String path = "src/stream/io/ConsoleExample.java";
		FileInputStream fis = new FileInputStream(path);
		int data;
		try {
			while ((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
