package io;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample2 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		byte[] buf = new byte[100];
		System.out.println("Name: ");
		int nameBytes = is.read(buf);
		String name = new String(buf, 0, nameBytes - 1);
		System.out.println("introduce: ");
		int commentBytes = is.read(buf);
		String comment = new String(buf, 0, commentBytes - 1);

		System.out.println("name => " + name);
		System.out.println("comment => " + comment);
	}
}
