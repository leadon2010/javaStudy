package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args) {
//		try (FileInputStream fis = new FileInputStream("src/exceptions/MultiCatchExample.java")) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/exceptions/MultiCatchExample.java");
			int readByte = -1;
			while ((readByte = fis.read()) != -1) {
				System.out.write(readByte);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
