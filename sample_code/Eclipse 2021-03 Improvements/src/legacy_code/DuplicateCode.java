package legacy_code;

public class DuplicateCode {
	void sample(boolean isValid, int i, int j) {

		// (8/16) Pull down common code from if/else statement
		if (isValid) {
			++i;
		} else {
			j++;
			i= i + 1;
		}

	}
}