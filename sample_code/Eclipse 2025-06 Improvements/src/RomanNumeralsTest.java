import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RomanNumeralsTest {

    @Test
	void testOf() {
		assertEquals("I", RomanNumerals.of(1));
		assertEquals("II", RomanNumerals.of(2));
		assertEquals("III", RomanNumerals.of(3));
		assertEquals("IV", RomanNumerals.of(4));
	}

    @Test
    void testReplace() {
    		assertEquals("Eclipse MMXXV-VI", RomanNumerals.replace("Eclipse 2025-06"));
    		assertEquals("III II I BOOM!", RomanNumerals.replace("3 2 1 BOOM!"));
    }

}