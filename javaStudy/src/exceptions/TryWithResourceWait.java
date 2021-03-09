package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceWait {
	public static void main(String[] args) {
//		try (FileInputStream fis = new FileInputStream("src/exceptions/MultiCatchExample.java")) {
		FileInputStream fis = null;
		try {
//			fis = new FileInputStream("src/exceptions/MultiCatchExampleq.java");
			fis = new FileInputStream("list.txt");

			int readByte = -1;
			while ((readByte = fis.read()) != -1) {
				System.out.write(readByte);
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e1) {
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				System.out.println("파일을 닫을 수 없습니다.");
				e.printStackTrace();
			}
		}

		System.out.println("end of program");
	}
}
