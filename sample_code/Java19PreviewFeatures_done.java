class Java19PreviewFeatures {

	record Box(Box box, Object value) {}

	public static void main(String[] args) {
		var innerBox = new Box(null, 42);
		var outerBox = new Box(innerBox, "outer");


		// JEP 405: Record Patterns (Preview)
		if (innerBox instanceof Box(Box inner, Integer value)) {
			System.out.println("'innerBox' contains " + value);
		}
		if (outerBox instanceof Box(Box(Box b2,Integer i) b1, String name)) {
			System.out.println(name + " contains a nested box containing " + i);
		}

		// JEP 427: Pattern Matching for switch (Third Preview)
		Object obj = "Jane";
		switch (obj) {
		case String s when !s.isBlank() -> System.out.println("Hello " + s);
		default -> System.out.println("What's your name?");
		}

		// JEP 405 + JEP 427
		switch (outerBox) {
		case Box(Box(Box b2,Integer i) b1, String s) when !s.isBlank() -> System.out.println("Hello " + s);
		default -> System.out.println("What's your name?");
		}

	}
}