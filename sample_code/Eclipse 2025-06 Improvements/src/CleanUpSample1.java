import java.util.List;

class CleanUpSample1 {

	// Unnecessary Code > Remove unnecessary suppress warnings tokens

	@SuppressWarnings("rawtypes")
	void sample() {
		// ...
	}

	@SuppressWarnings({ "rawtypes", "serial" })
	class Inner {
		List list;
	}

}