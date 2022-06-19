package com.example;
class FasterConsole {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 1; i <= 500_000; i++) {
			System.out.println(i + ".".repeat(240));
		}
		System.out.printf("time: %.3f s", (System.currentTimeMillis() - start) / 1_000f);
	}

}