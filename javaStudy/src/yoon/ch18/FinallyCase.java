package yoon.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
	public static void main(String[] args) {
		Path file = Paths.get("c:\\javastudy\\simple.txt");
		BufferedWriter writer = null;
		try {
			writer = Files.newBufferedWriter(file);
			writer.write('A');
			writer.write('Z');

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			if (writer != null)
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}// end of main
}// end of class
