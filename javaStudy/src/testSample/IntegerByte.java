package testSample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IntegerByte {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("1.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("2.txt"))) {
			String str;
			while (true) {
				str = br.readLine();
				if (str == null)
					break;
				bw.write(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("completed.");
	}// end of main
}// end of class
