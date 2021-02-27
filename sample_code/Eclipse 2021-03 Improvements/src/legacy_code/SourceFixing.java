package legacy_code;

import java.math.BigInteger;
import java.time.DayOfWeek;

public class SourceFixing {
	void sample(String command, DayOfWeek today, BigInteger value1, BigInteger value2) {

		// (4/16) Avoid Object::equals or String::equalsIgnoreCase on null objects
		if (command.equals("exit")) return;
		double factor= today.equals(DayOfWeek.SUNDAY) ? 1.5 : 1; 
		if (System.getProperty("debug").equalsIgnoreCase("yes")) {
			// ...
		}

		// (5/16) Compare to zero
		boolean isSmaller= value1.compareTo(value2) == -1;

	}
}