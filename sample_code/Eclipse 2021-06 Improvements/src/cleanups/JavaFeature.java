package cleanups;

public class JavaFeature {
	void sample(Object object) {

		// Pattern matching for instanceof (Java 16)
		if (object instanceof String) {
			String s = (String) object;
			System.out.println(s.toUpperCase());
		}

		// (1/12) Replace system property with constant
		String fileSeparator = System.getProperty("file.separator"); // \ or /
		String pathSeparator = System.getProperty("path.separator"); // ; or :
		String lineSeparator = System.getProperty("line.separator"); // \r\n, \n or \r
		String fileEncoding = System.getProperty("file.encoding");   // Cp1252, UTF-8, ...
		Boolean booleanProperty =
				Boolean.parseBoolean(System.getProperty("myProperty")); // -DmyProperty=true

	}
}