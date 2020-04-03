package stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Dstream {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		Path dir = Paths.get("src");
		Stream<Path> dstream = Files.list(dir);
		dstream.forEach(d -> System.out.println(d.getFileName()));

		System.out.println("=======================");
		Path path = Paths.get("src/stream/line.txt");
		Stream<String> stream;

		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out::println);
		System.out.println();

		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out::println);

	}
}
