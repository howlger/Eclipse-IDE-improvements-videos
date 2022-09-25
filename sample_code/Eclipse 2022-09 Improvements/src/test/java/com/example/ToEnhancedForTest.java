package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.jupiter.api.Test;

class ToEnhancedForTest {

	private static final PrintStream ORIGINAL_OUT = System.out;

	@Test
	void permutationsOfArrays() {
		try {
			var out = new ByteArrayOutputStream();
			System.setOut(new PrintStream(out));
			new ToEnhancedFor().permutations(new String[] { "a", "b" }, new String[] { "1", "2", "3" });
			assertEquals("""
					a1
					a2
					a3
					b1
					b2
					b3
					""".replace("\n", System.lineSeparator()), out.toString());
		} finally {
			System.setOut(ORIGINAL_OUT);
		}
	}

	@Test
	void permutationsOfLists() {
		try {
			var out = new ByteArrayOutputStream();
			System.setOut(new PrintStream(out));
			new ToEnhancedFor().permutations(List.of("a", "b"), List.of("1", "2", "3"));
			assertEquals("""
					a1
					a2
					a3
					b1
					b2
					b3
					""".replace("\n", System.lineSeparator()), out.toString());
		} finally {
			System.setOut(ORIGINAL_OUT);
		}
	}

}
