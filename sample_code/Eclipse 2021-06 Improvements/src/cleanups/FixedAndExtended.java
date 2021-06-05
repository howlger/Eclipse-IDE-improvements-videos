package cleanups;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixedAndExtended {
	String sample(String text, String delimiter, String name) {

		// Simplify lambda expression and method reference syntax
		Function<String, Integer> f = s -> strippedLength(s); // not this::strippedLength

		// Use String.replace() instead of String.replaceAll() when possible
		return text.replaceAll(":-\\)", "\\\\o/")
		           .replaceAll("\\.", "/")
		           .replaceAll(Pattern.quote(delimiter), "\n")
		           .replaceAll("\\[name\\]", Matcher.quoteReplacement(name));

	}

	static int strippedLength(String string) {
		return string.strip().length();
	}

}