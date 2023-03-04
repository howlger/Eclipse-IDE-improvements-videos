import java.util.stream.Stream;

class Sample {

	record Person(String name) {
	}

	void log(Stream<String> lines) {
		if (lines != null) {
			lines.forEach(current -> {
				if (current.startsWith("ERROR")) {
					
				}
			});
		}
	}

}
