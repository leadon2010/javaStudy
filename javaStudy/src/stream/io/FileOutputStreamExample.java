package stream.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	public static void main(String[] args) {
		String originalFileName = "src/stream/io/test.jpg";
		String targetFileName = "src/stream/io/copied.jpg";
		try {
			FileInputStream fis = new FileInputStream(originalFileName);
			FileOutputStream fos = new FileOutputStream(targetFileName);
			int read;
			byte[] readBytes = new byte[100];
			while ((read = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, read);
			}
			fis.close();
			fos.flush();
			fos.close();
			System.out.println("copied.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
