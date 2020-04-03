package stream.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamExample {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("test.txt");
		byte[] data = "ABC".getBytes();
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();

		InputStream is = new FileInputStream("test.txt");
		int readByte;
		while ((readByte = is.read()) != -1) {
			System.out.println((char) readByte);
		}
		is.close();

	}
}
