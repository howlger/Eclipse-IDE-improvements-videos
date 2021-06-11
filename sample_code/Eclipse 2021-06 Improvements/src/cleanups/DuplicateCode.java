package cleanups;

public class DuplicateCode {
	void sample(boolean isEnabled, boolean isA, boolean isB) {

		// (6/12) Replace (X && Y) || (X && Z) by (X && (Y || Z))
		if (isEnabled && isA || isEnabled && isB) {
			// ...
		}

		// (7/12) Single 'if' statement rather than duplicate blocks that fall through
		if (isA) {
			System.out.println("The same code");
			throw new IllegalStateException();
			// ...
		}
		if (isB) {
			System.out.println("The same code");
			throw new IllegalStateException();
			// ...
		}

		// (8/12) Pull out a duplicate 'if' from an if/else
		if (isEnabled) {
			if (isA) {
				// enabled in mode A
				// ...
			}
		} else {
			if (isA) {
				throw new IllegalStateException("A, but not enabled");
			}
		}

	}
}