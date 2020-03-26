package zzz;

import java.io.File;
import java.io.IOException;

public class NewFile {
	public static void main(String[] args) {
		File myObj = new File("createFile.txt");
		try {
			if (myObj.createNewFile()) {
				System.out.println("File Created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error Occurred.");
			e.printStackTrace();
		}
	}
}
