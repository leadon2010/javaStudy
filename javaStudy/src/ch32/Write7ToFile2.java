package ch32;

import java.io.FileOutputStream;
import java.io.OutputStream;

class Write7ToFile2 {
	public static void main(String[] args) throws Exception {
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