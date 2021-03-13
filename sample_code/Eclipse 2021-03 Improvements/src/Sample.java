import java.io.FileNotFoundException;
import java.util.Map.Entry;
import java.util.Properties;

public abstract class Sample {

	public static void main(String[] args) throws Exception {
		for (Entry<Object, Object> setting : readConfig().entrySet()) {
			System.out.println(setting.getKey() + ": " + setting.getValue());
		}
	}

	private static Properties readConfig() throws FileNotFoundException {
		var properties = new Properties();
		return properties;
	}

	abstract void foo();

}
