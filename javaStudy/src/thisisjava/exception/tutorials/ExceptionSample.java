package thisisjava.exception.tutorials;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ExceptionSample {
	static int SIZE = 10;

	public static void writeList(List list) {

		try (PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));) {
			for (int i = 0; i < SIZE; i++) {
				out.println("Value at: " + i + " = " + list.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	}
}
