package core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloTest {
	
    @Test public void testGet() {
        Hello classUnderTest = new Hello("world");
        assertEquals("Hello world", classUnderTest.get());
    }
}
