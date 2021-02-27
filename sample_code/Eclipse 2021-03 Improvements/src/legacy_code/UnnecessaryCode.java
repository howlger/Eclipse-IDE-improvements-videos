package legacy_code;

public class UnnecessaryCode {
	void sample(String line, boolean isFound, boolean isValid) {

		// (9/16) Redundant String.substring() parameter
		String comment= line.substring(line.indexOf("//") + 2, line.length());

		// (10/16) Unreachable block
		if (isFound && isValid) {
			System.out.println("done.");
		} else if (isValid && isFound) {
			System.out.println("dead code");
		}

		// (11/16) Convert loop into if when possible
		while (isValid) {
			System.out.println("valid");
			return;
		}
		while (isFound) {
			System.out.println("found");
			break;
		}

	}
}