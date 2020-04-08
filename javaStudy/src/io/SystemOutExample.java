package io;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws IOException {
		OutputStream ps = System.out;
		byte[] buf = "홍길동".getBytes();
		System.out.println(buf.length);
		ps.write(buf);
		ps.flush();

	}
}
