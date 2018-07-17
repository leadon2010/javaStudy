package ch32;

import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedFileCopier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일: ");
		String src = sc.nextLine();

		System.out.print("사본 이름: ");
		String dst = sc.nextLine();

		try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {
			byte buf[] = new byte[1024];
			int len;

			int j = 0;
			while (true) {
				len = in.read(buf);
				if (len == -1)
					break;

				//for (int i = 0; i < buf.length; i++)
				//	System.out.println("j번째시도: " + j + "===" + i + "::::" + buf[i] + " " + (char) buf[i]);
				System.out.println(j+" "+len);
				out.write(buf, 0, len);
				j++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}