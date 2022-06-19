package com.example;

import static com.example.CodeSnippets.toRomanNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RomanNumberTest {

	@Test
	void testCodeSnippet() {

		var roman_I=      toRomanNumber(1);
		var roman_II=     toRomanNumber(2);
		var roman_XLII=   toRomanNumber(42);
		var roman_MMXXII= toRomanNumber(2022);

		assertEquals("I", roman_I);
		assertEquals("II", roman_II);
		assertEquals("XLII", roman_XLII);
		assertEquals("MMXXII", roman_MMXXII);
	}

	@Test
	void test0() {
		assertTrue(true);
	}

	@Test
	void test1() {
		assertTrue(false);
	}
	
}
