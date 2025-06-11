class CleanUpSample2 {

	// Java Feature > Java 21 > Pattern instanceof to Switch
	void sample(Object obj) {
		if (obj instanceof Integer i) {
			System.out.println("Integer: " + i);
		} else if (obj == null) {
			System.out.println("null");
		} else if (obj instanceof Boolean b) {
			System.out.println("Boolean: " + b);
		} else {
			System.out.println("unknown");
		}
	}

}