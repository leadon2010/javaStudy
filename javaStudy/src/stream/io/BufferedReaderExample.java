package stream.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
//		InputStream is = System.in;
		FileInputStream is = new FileInputStream("hangul.txt");
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
//		System.out.println("input: ");
		String lineString = br.readLine();
		System.out.println("output: " + lineString);
		br.close();
	}
}
