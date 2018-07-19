package ch33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SimpleTxtWriteRead {
	public static void main(String[] args) throws IOException {
		Path fp = Paths.get("C:\\JavaStudy\\simple.txt");
		String st1 = "one simple text";
		String st2 = "two simple text";
		List<String> lst1 = Arrays.asList(st1, st2);
		System.out.println("lst1: " + lst1);
		Files.write(fp, lst1);
		List<String> lst2 = Files.readAllLines(fp);
		System.out.println("lst2: " + lst2);

	}
}
