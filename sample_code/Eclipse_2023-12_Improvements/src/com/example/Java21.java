package com.example;
class Java21 {
	int sample(Object item, Pair pair, NamedPair namedPair) {

		// Pattern Matching for switch (JEP 441)
		switch (item) {
		case String s:
			System.out.println(s);
			break;
		case Object obj:
			System.out.println("Unknown item");
		}


		// Record Patterns (JEP 440)...

		// ... switch statement
		switch (pair) {
		case Pair(Integer x, Integer y):
			System.out.println(x + y);
			break;
		case Pair(Object a, Object b):
			break;
		}

		// ... switch expression
		int result = switch (pair) {
		case Pair(Integer level, Boolean enabled) when enabled -> level;
		default -> -1;
		};

		// ... if
		if (pair instanceof Pair(Integer x, Integer y)) {
			return x + y;
		}

		// nested
		if (namedPair instanceof NamedPair(String name, Pair(Integer x, Integer y))) {
			System.out.println(name);
			return x + y;
		}
		return result;
	}
	record Pair(Object x, Object y) {}
	record NamedPair(String name, Pair pair) {}
}