import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Java23Test {

	@Test
	void testCharCounterImplementations() {
		testCharCounterImplementations(2, "Hello, world!", 'o');
		testCharCounterImplementations(3, "strawberry", 'r');
	}

    void testCharCounterImplementations(int expected, String text, char c) {
    	var counter= new Java23();
    	assertEquals(expected, counter.countCharA(text, c));
    	assertEquals(expected, counter.countCharB(text, c));
    }

}
