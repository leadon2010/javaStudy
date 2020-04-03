package stream.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("filewriter.txt", true);
		fw.write("FileWriter는 한글로 된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다" + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("saved.");
	}
}
