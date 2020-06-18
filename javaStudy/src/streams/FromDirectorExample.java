package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromDirectorExample {
	public static void main(String[] args) {
		Path path = Paths.get("c:/program files");
		try {
			Stream<Path> stream = Files.list(path);
			stream.forEach(new Consumer<Path>() {
				@Override
				public void accept(Path t) {
					System.out.println(t.getFileName());
				}
			});
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
