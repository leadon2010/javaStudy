package stream.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);

		int readChar;
		char[] cbuf = new char[100];
		while ((readChar = reader.read(cbuf)) != -1) {
			System.out.println(new String(cbuf, 0, readChar));
		}
		reader.close();
	}
}
