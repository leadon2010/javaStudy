package yoon.ch32;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

class BufferedStreamFileCopier {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일: ");
		String src = sc.nextLine();

		System.out.print("사본 이름: ");
		String dst = sc.nextLine();

		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))) {

			int data, j = 0;
			while (true) {
				data = in.read();
				if (data == -1)
					break;
				out.write(data);
				if (j / 1000 == 0)
					System.out.println(j);
				j++;
			}
			System.out.println("end of prgm");
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (sc != null)
			sc.close();
	}
}