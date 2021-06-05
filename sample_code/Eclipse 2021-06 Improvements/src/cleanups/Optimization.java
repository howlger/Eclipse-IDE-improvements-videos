package cleanups;

public class Optimization {
	void sample(String input, String comment, double length) {

		// (2/12) String.isBlank() rather than String.strip().isEmpty()
		if ("".equals(input.strip())) {
			System.err.println("Input must not be blank");
		};

		// Tip for Java 11+: manually trim() => strip()
		// Removing of leading and trailing:
		// - trim():  \u0000 .. \u0020
		// - strip(): Character.isWhitespace(char)
		boolean hasComment1 = comment.trim().length() > 0;
		boolean hasComment2 = comment.strip().length() > 0;

		// (3/12) valueOf() rather than instantiation
		// Integer, Long, Double, Short, Float, Boolean, Byte, Character
		Float f = new Float("3.14");
		long l = new Long(42);
		int i = new Integer("42").intValue();

		// (4/12) Primitive type rather than wrapper class
		Integer countdown = 10;
		while (countdown >= 0) {
			System.out.println(countdown.intValue());
			countdown--;
		}

	}
}