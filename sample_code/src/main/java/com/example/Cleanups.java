package com.example;

import java.util.Locale;

class Cleanups {

	// Unnecessary Code: Remove unused private method parameters
	private void unnecessaryCode(String text, int unused) {
		System.out.println(text);

		// Unnecessary Code: Remove overridden assignment > Move declaration if necessary
		long start = System.currentTimeMillis();
		long end = 0;
		// ... (to measure)
		String msg= "";
		msg= "time: %.3f s";
		end = System.currentTimeMillis();
		System.out.printf(Locale.US, msg, (end - start) / 1_000f);

		// Java Feature: Replace system property with constant > Boxed type property
		boolean verbose= Boolean.parseBoolean(System.getProperty("verbose"));
		int bit= Integer.parseInt(System.getProperty("sun.arch.data.model", "32")); // new
		long serial= Long.parseLong(System.getProperty("serial.number", "0")); // new
		System.out.printf("verbose: %s%n%s bit%nserial: %s", verbose, bit, serial);

	}

}
