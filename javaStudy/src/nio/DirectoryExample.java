package nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExample {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("C:/Temp/dir/subdir");
		Path path2 = Paths.get("C:/Temp/file.txt");

		if (Files.notExists(path1)) {
			Files.createDirectories(path1);
		}

		if (Files.notExists(path2)) {
			Files.createFile(path2);
		}

		Path path3 = Paths.get("C:/Temp");
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);
		for (Path path : directoryStream) {
			if (Files.isDirectory(path3))
				System.out.println("[directory] " + path.getFileName());
			else
				System.out.println("[file] " + path.getFileName() + "(size: " + Files.size(path3) + ")");
		}
	}

}
