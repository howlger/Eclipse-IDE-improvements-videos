import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

class Java22 implements Consumer<Object> {

	record Order(String name, int quantity) {}

	/**
	 * Samples for JEP 456: Unnamed Variables & Patterns
	 */
	int jep456(List<BiConsumer<String, Integer>> notifiers, Iterable<?> items, Order order) {

		// unnamed lambda parameter
		notifiers.add((name, _) -> System.out.println(name));

		// unnamed exception parameter
		try {
			// ...
		} catch (RuntimeException _) {
			// ignore
		}

		// unnamed pattern parameter
		switch (order) {
		case Order(var _, var quantity) when quantity <= 0 -> throw new RuntimeException("Zero or negative quantity");
		case Order(var name, var _) when name.isBlank() -> throw new RuntimeException("Blank name");
		default -> { /* ... */ }
		}

		// unnamed local variable
		int total = 0;
		for (Object _ : items) {
			total++;
		}
		return total;

	}

	@Override
	public void accept(Object obj) {
		// ...
	}

}