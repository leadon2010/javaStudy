package stream.io;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {
	public static void main(String[] args) throws IOException {

		InputStream is = System.in;
		byte[] bytes = new byte[100];
		System.out.print("이름:");
		int nameBytes = is.read(bytes);
		String name = new String(bytes, 0, nameBytes - 1);
		System.out.print("하고 싶은말: ");
		int commentBytes = is.read(bytes);
		String comment = new String(bytes, 0, commentBytes - 1);

		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 내용: " + comment);
	}
}
