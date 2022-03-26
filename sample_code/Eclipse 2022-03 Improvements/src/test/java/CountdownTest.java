import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class CountdownTest {

	@Test
	void testOutput() {
		var log = new ByteArrayOutputStream();
		System.setOut(new PrintStream(log));
		new Countdown();
		var expected = """
				3
				2
				1
				0
				""".replace("\n", System.lineSeparator());
		assertEquals(expected, new String(log.toByteArray()));
	}

}
