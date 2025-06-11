import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanNumerals {

	// public

	public static String of(int number) {
		return "I".repeat(number)
				.replace("IIIII", "V")
				.replace("IIII", "IV")
				.replace("VV", "X")
				.replace("VIV", "IX")
				.replace("XXXXX", "L")
				.replace("XXXX", "XL")
				.replace("LL", "C")
				.replace("LXL", "XC")
				.replace("CCCCC", "D")
				.replace("CCCC", "CD")
				.replace("DD", "M")
				.replace("DCD", "CM");
	}

	public static String replace(String text) {
		return Stream.of(text.split("(?<=\\w)(?=\\W)|(?<=\\W)(?=\\w)"))
			.map(RomanNumerals::convertToken)
			.collect(Collectors.joining());
	}

	// 

	private static String convertToken(String token) {
		try {
			var n = Integer.parseInt(token);
			if (n >= 1) {
				return of(n);
			}
		} catch (NumberFormatException e) {
			// not an integer, so do not convert
		}
		return token;
	}

}