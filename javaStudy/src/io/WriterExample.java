package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("src/io/writer.txt");
		String data = "안녕, 자바 프로그램 반가워...";
		fw.write(data);
		fw.flush();
		fw.close();

		FileReader fr = new FileReader("src/io/writer.txt");
		int readChar;
		while ((readChar = fr.read()) != -1) {
			System.out.print((char) readChar);
		}
		fr.close();

	}
}
