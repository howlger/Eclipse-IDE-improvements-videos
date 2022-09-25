package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ElementTest {

	@Test
	void testNaming() {
		var element = new Element();
		element.setName("Jane");
		assertEquals("Jane", element.getName());
	}

}
