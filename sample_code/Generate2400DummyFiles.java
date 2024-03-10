import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

class Generate2400DummyFiles {

	public static void main(String[] args) throws IOException {
		try {
			Files.createDirectory(Path.of("data"));
		} catch (FileAlreadyExistsException e) {
			// "data" directory already exists
		}
		for (int i = 1; i <= 2400; i++) {
			try (var unused= new FileWriter(String.format("data/data_%04d.dat", i))) {
			}
		}
	}

}
