package thisisjava.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class FileInputStream implements AutoCloseable {
	private String file;

	public FileInputStream(String file) {
		super();
		this.file = file;
	}

	public void read() {
		System.out.println(file + " 을 읽습니다");
	}

	@Override
	public void close() throws Exception {
		System.out.println(file + " 을 닫습니다");
	}

}

public class TryWithResourceExample {
	public static void main(String[] args) {
		// try..catch..finally..
		OutputStream out = null;
		InputStream inpt = null;
		try {
			out = new FileOutputStream("data.txt");
			out.write(7);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			inpt = new java.io.FileInputStream("data.txt");
			System.out.println("data.txt => " + inpt.read());
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inpt.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// try-with-resource 문.
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다.");
		}
	}
}
