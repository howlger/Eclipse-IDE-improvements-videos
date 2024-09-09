import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void test() throws IOException {

		// <environmentVariables>
		assertEquals("ACCESS_TOKEN_VALUE", System.getenv("ACCESS_TOKEN"));

		// <systemPropertyVariables>
		assertEquals("allow", System.getProperty("java.security.manager"));

		// <workingDirectory>
		Files.readAllLines(Path.of("test_data.txt")).forEach(line -> {
			// ...
		});

	}

}
