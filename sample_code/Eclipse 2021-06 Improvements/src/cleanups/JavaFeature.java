package cleanups;

public class JavaFeature {
	void sample(Object object) {

		// Pattern matching for instanceof (Java 16)
		if (object instanceof String) {
			String s = (String) object;
			System.out.println(s.toUpperCase());
		}

		// (1/12) Replace system property with constant
		String pathSeparator = System.getProperty("path.separator"); // ; or :
		String fileSeparator = System.getProperty("file.separator"); // \ or /
		String fileEncoding = System.getProperty("file.encoding");   // Cp1252, UTF-8, ...
		String lineSeparator = System.getProperty("line.separator"); // \r\n, \n or \r
		Boolean booleanProperty =
				Boolean.parseBoolean(System.getProperty("myProperty")); // -DmyProperty=true

	}
}