package ch32;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Write7ToFile2 {
	public static void main(String[] args) throws IOException {
		OutputStream out = null;

		try {
			out = new FileOutputStream("data.dat");
			out.write(7);
		} finally {
			if (out != null)
				out.close();
		}
	}
}