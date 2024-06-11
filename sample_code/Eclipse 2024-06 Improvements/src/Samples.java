import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Samples {

	/**
	 * New quick assist:
	 *     Split try resource expressions into inner try-with-resources
	 */
	void sample(String fileName1, String fileName2, String fileName3) {
		try (Reader reader1 = new BufferedReader(new FileReader(fileName1));
				Reader reader2 = new BufferedReader(new FileReader(fileName2));
				Reader reader3 = new BufferedReader(new FileReader(fileName3))) {
			// ...
		} catch (IOException e) {
			// ...
		}
	}

	/**
	 * New quick assist:
	 *     Extract anonymous class declaration to local
	 */
	Runnable extractAnonymousClass() {
		return new Runnable() {

			@Override
			public void run() {
				// ...
			}

		};
	}

	/**
	 * Improved quick assists:
	 *     Use 'MessageFormat/String.format' for string concatenation
	 */
	String extractAnonymousClass(String name) {
		return "Hello "
				+ name
				+ "!\nWelcome!\n";
	}

	// Refactor > Encapsulate Field(s)...
	int x;
	int y;

	/**
	 * Improved clean-up:
	 *     Unnecessary Code > Remove overridden assignment
	 */
	void sample() {
		long start;
		start = System.nanoTime();
		// ...
		System.out.println((System.nanoTime() - start) + " ns");
	}

	/** @see Collectors#toMap(Function, Function, BinaryOperator, Supplier) */
	void javadocStyling() {}

}