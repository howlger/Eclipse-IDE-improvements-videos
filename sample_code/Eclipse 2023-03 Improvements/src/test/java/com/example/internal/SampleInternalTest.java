package com.example.internal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleInternalTest {

	@Test
	void testRun() {
		int last= -1;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			assertEquals(last, i - 1);
			last= i;
		}
	}

}
