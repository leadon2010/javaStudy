package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("src/io/reader.txt");
			int readChar;
			char[] cbuf = new char[2];
			while ((readChar = fr.read(cbuf)) != -1) {
				for (char c : cbuf) {
					System.out.print(c);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e1) {
			System.out.println("file not found.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fr.close();
		} catch (IOException e) {
			System.out.println("error occurred.");
		}
	}
}
