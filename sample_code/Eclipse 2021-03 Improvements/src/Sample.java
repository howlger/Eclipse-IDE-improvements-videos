import java.io.FileNotFoundException;
import java.util.Map.Entry;
import java.util.Properties;

public class Sample {
// 3. public sealed class Sample permits SubSample {

	public static void main(String[] args) throws Exception {
		for (Entry<Object, Object> setting : readConfig().entrySet()) {
			System.out.println(setting.getKey() + ": " + setting.getValue());
		}
	}

	// Quick assists: Assign to new local variable in try-with-resources (Ctrl+2, T)
	private static Properties readConfig() throws FileNotFoundException {
		Properties properties = new Properties();
		// 1.+2. new FileReader("config")
		return properties;
	}

}
