package stream.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);

		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("출력합니다.");
		ps.flush();
		ps.close();
		fos.close();

		FileInputStream fis = new FileInputStream("print.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int readByte;
		byte[] cbuf = new byte[100];
		while ((readByte = bis.read(cbuf)) != -1) {
			String output = new String(cbuf, 0, readByte);
			System.out.print(output);
		}
		bis.close();
		fis.close();

	}
}
