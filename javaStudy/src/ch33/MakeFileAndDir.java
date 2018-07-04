package ch33;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

class MakeFileAndDir {
	public static void main(String[] args) throws IOException {
		Path fp = Paths.get("C:\\JavaStudy\\empty3.txt");
		fp = Files.createFile(fp);

		Path dp1 = Paths.get("C:\\JavaStudy\\Empty3");
		dp1 = Files.createDirectory(dp1);

		Path dp2 = Paths.get("C:\\JavaStudy3\\Empty");
		dp2 = Files.createDirectories(dp2);

		System.out.println("File: " + fp);
		System.out.println("Dir1: " + dp1);
		System.out.println("Dir2: " + dp2);
	}
}
