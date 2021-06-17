package cleanups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Improved {
	String sample(String text, String delimiter, String name, boolean isEnabled, boolean isFound) {

		// Merge conditions of if/else if/else that have the same blocks
		if (isEnabled) {
			if (isFound) {
				// found ...
			} else {
				System.out.println("Duplicate code");
				// ...
			}
		} else {
			System.out.println("Duplicate code");
			// ...
		}

		// Use String.replace() instead of String.replaceAll() when possible
		return text.replaceAll(":-\\)", "\\\\o/")
		           .replaceAll(Pattern.quote(delimiter), "\n")
		           .replaceAll("\\[name\\]", Matcher.quoteReplacement(name))
		           .replaceAll("\\.", "/");

	}
}
