package stream.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("src/stream/io/test.jpg");
		int readByte;
		byte[] readBytes = new byte[100];
		while ((readByte = is.read(readBytes)) != -1) {
			System.out.print(readByte);
			if (readByte % 10000 == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println("end of program");
	}
}
