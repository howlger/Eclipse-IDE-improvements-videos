class Sample {

	// 255
	int hex = 0xff;
	int oct = 0377;
	int bin = 0b11111111;

	// 65280.0 (255 << 8)
	double mask = 0xffp8d;

	// For deprecated method call: "Replace with inlined method" quick fix
	void printBoost(int a, int b, int c) {
		int boost = Api.getFactor(a, b, c);
		System.out.println(boost);
	}

	// Code completion proposes matching constructor parameters first
	void runTask(Task task) {
		new Job().run();
	}

	// Extract local variable: proposed name based on existing code
	int getFactor(int a, int k) {
		return Api.getFactor(a, k);
	}

	// Improved "Convert to lambda expression" quick fix (also as clean-up)
	void asyncInit() {
		Runnable initJob = new Runnable() {
			@Override
			public void run() {
				Api.init();
			}
		};
		// Before:   ... = () -> Api.init();
		new Thread(initJob).start();
	}

}

class Api {

	/**
	 * @deprecated use {@link #getFactor(int, int)} instead
	 */
	@Deprecated
	public static int getFactor(int x, int y, int z) {
		int k = 2 * y + 3 * z;
		return getFactor(x, k);
	}

	public static int getFactor(int a, int b) {
		return a + b;
	}

	public static void init() { /* ... */ }
}

record Job(String id, String name) implements Runnable {

	Job() {
		this(null, null);
	}

	@Override
	public void run() { /* ... */ }

}

record Task(String id, String name) {}