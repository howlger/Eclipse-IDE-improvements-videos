package cleanups;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class UnnecessaryCode {
	boolean sample(boolean isValid, int number, Boolean isFound, List<Date> listToSort ) {

		// (9/12) Boolean value rather than comparison
		boolean valid	= isValid == true;
		boolean invalid  = isValid == false;
		boolean negative = Boolean.FALSE.equals(number > 0);
		boolean missing  = isFound.equals(Boolean.FALSE);

		// (10/12) Use implicit comparator when possible
		Collections.sort(listToSort, new Comparator<Date>() {
			@Override
			public int compare(Date date1, Date date2) {
				return date1.compareTo(date2);
			}
		});

		// (11/12) Create array with curly when possible
		double[] doubleArray = new double[] { 42.42 };

		// (12/12) Remove variable assignment before return
		boolean result = isValid && isFound;
		return result;

	}
}