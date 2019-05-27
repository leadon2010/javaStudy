package yoon.ch33;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileCopierVerNIO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("대상 파일: ");
		Path src = Paths.get(sc.next());
		System.out.println("사본 파일: ");
		Path dst = Paths.get(sc.next());
		ByteBuffer buf = ByteBuffer.allocate(1024);
		// try에서 두개의 채널 설정
		try (FileChannel ifc = FileChannel.open(src, StandardOpenOption.READ);
				FileChannel ofc = FileChannel.open(dst, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
			int num;
			while (true) {
				num = ifc.read(buf);
				System.out.println("buf: " + buf + " num: " + num);
				if (num == -1)
					break;
				buf.flip();
				ofc.write(buf);
				buf.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of program");
	}// end of main
}// end of FileCopierVerNIO
