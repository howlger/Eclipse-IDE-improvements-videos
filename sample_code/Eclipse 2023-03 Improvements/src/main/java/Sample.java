import java.util.stream.Stream;
class Sample {

	record Person() {}

	String[] logErrors(Stream<String> lines) {
		if (lines != null) {
			lines.forEach(current -> {
				if (current.startsWith("ERROR")) {
					
				}
			});
		}
		return null;
	}
	
	void run() {
		// ...
	}

	void sample(Runnable runnable) {
		runnable.run();
	}
	
	void start() {
		new Thread(this::run).start();
	}

}