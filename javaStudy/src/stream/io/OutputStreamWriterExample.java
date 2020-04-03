package stream.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("outputstreamwriter.txt");
		Writer writer = new OutputStreamWriter(fos);
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환하는 OutputStreamWriter";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일저장이 완료.");
	}
}
