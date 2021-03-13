package legacy_code;

import java.io.IOException;
import java.util.Comparator;

public class JavaFeature {
	void sample(Object arg) {

		// (1/16) Pattern matching for instanceof (Java 15 preview feature)
		if (arg instanceof String) {
			String s= (String) arg;
			String trimmed= s.trim();
			// ...
		}
		if (!(arg instanceof String)) return;
		String s= (String) arg;
		String trimmed= s.trim();
		// ...

		// (2/16) Use Comparator.comparing() (Java 8)
		Comparator<Object> asStringsComparator=
				new Comparator<>() {
			@Override
			public int compare(Object o1, Object o2) {
				if (o2 != null) {
					if (o1 != null) {
						return o1.toString().compareTo(o2.toString());
					}
					return -1; // nulls first
				} else if (o1 != null) {
					return 1; // nulls first
				} else {
					return 0;
				}
			}
		};

		// (3/16) Use Multi-catch (Java 7)
		try {
			readConfig(arg);
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}
	void readConfig(Object arg) throws IllegalArgumentException, IOException {}
}