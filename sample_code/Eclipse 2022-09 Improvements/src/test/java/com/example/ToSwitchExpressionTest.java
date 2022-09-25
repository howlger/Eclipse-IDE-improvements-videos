package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.ToSwitchExpression.Level;

class ToSwitchExpressionTest {

	@Test
	void testGetScoring() {
		var dut = new ToSwitchExpression();
		assertEquals(-1, dut.getScoring(Level.A, 0));
		assertEquals(9, dut.getScoring(Level.B, 10));
		assertEquals(39, dut.getScoring(Level.C, -3));
		assertThrows(IllegalArgumentException.class, () -> {
			dut.getScoring(Level.D, 42);
		});
	}

	@Test
	void testGetLevelFactor() {
		var dut = new ToSwitchExpression();
		assertEquals(-1, dut.getLevelFactor(Level.A));
		assertEquals(-1, dut.getLevelFactor(Level.B));
		assertEquals(42, dut.getLevelFactor(Level.C));
		assertThrows(IllegalArgumentException.class, () -> {
			dut.getLevelFactor(Level.D);
		});
	}

}
