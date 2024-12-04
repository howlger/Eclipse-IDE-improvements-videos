public class Java23 {

	// JEP 467: Markdown Documentation Comments

	/// {@return the number of the given char in a given text}
	///
	/// Examples:
	/// - `countCharB("Hello, world!", 'o')` returns 2
	/// - `countCharB("strawberry", 'r')` returns 3
	///
	/// @param text   the [String] that must not be `null`
	/// @param c   the char to count
	public long countCharA(String text, char c) {
		return text.chars().filter(cc -> cc == c).count();
	}

	/**
	 * {@return the number of the given char in a given text}
	 *
	 * <p>Examples:</p>
	 * <ul>
	 *   <li>{@code countCharA("Hello, world!", 'o')} returns 2</li>
	 *   <li>{@code countCharA("strawberry", 'r')} returns 3</li>
	 * </ul>
	 *
	 * @param text   the {@link String} that must not be {@code null}
	 * @param c   the char to count
	 */
	public long countCharB(String text, char c) {
		long number= 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != c) continue;
			number++;
		}
		return number;
	}

}
