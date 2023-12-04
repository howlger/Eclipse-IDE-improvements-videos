package com.example;
class Sample {

	void printFactor(int x, int y) {
		int boost = Api.getFactor(x, y);
		System.out.println(boost);
	}

}

class Api {

	private static final int mask = 0xff;

	/**
	 * @deprecated use {@link #getFactor(int)} instead
	 */
	@Deprecated
	public static int getFactor(int x, int y) {
		int z = x + y;
		return getFactor(z);
	}

	public static int getFactor(int a) {
		return a & mask;
	}

}