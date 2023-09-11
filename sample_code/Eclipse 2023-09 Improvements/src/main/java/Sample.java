class Sample {

	// 255
	int hex = 0xff;
	int oct = 0377;
	int bin = 0b11111111;

	// 65280.0 (255 << 8)
	double mask = 0xffp8d;

	// For deprecated method call: "Replace with inlined method" quick fix
	void printFactor(int x, int y) {
		int boost = Api.getFactor(x, y);
		System.out.println(boost);
	}

	// Improved "Convert to lambda expression" quick fix (also as clean-up)
	void asyncInit() {
		Runnable initJob = new Runnable() {
			@Override
			public void run() {
				Api.init();
			}
		};
		// Runnable initJob = () -> Api.init();
		new Thread(initJob).start();
	}

}

class Api {

	/**
	 * @deprecated use {@link #getFactor(int)} instead
	 */
	@Deprecated
	public static int getFactor(int x, int y) {
		int z = x + y;
		return getFactor(z);
	}

	public static int getFactor(int a) {
		return a & 0xff;
	}

	public static void init() { /* ... */ }
}