package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromFileExample {
	public static void main(String[] args) {
		String files = "list.txt"; // "src/stream/lineData.txt"
		Path path = Paths.get(files);

		try {
			Stream<String> stream = Files.lines(path, Charset.defaultCharset());
			stream.forEach(new Consumer<String>() {
				@Override
				public void accept(String t) {
					System.out.println(t.toString());
				}
			});
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File file = path.toFile();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			Stream<String> stream = br.lines();
			stream.forEach(s -> System.out.println(s));
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
