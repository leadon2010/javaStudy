package stream.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("file.txt");
		String data = "안녕 자바 프로그램";
		writer.write(data);
		writer.flush();
		writer.close();

		Reader reader = new FileReader("file.txt");
		int readData;
		while ((readData = reader.read()) != -1) {
			System.out.print((char) readData);
		}
		reader.close();
	}
}
