package ch33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFileFromFiles {
	public static void main(String[] args) throws IOException {
		Path src = Paths.get("C:\\JavaStudy\\Dir1");
		Path dst = Paths.get("C:\\JavaStudy\\Dir2");
		Files.move(src, dst, StandardCopyOption.REPLACE_EXISTING);
	}
}
