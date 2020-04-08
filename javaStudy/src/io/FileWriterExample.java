package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileWriterExample {
	public static void main(String[] args) throws IOException {
		File file = new File("src/io/filewriter.txt");
		FileWriter fw = new FileWriter(file);

		List<String> list = Arrays.asList("Hello", "World", "Nice", "Good", "반갑습니다.", "한글도 돼요..");
		for (String str : list) {
			fw.write(str.toString() + "\n");
		}
		fw.flush();
		fw.close();
	}
}
