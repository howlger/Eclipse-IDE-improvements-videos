import java.util.Arrays;
import org.eclipse.jdt.annotation.Nullable;
class Sample {

	// Convert Class to Record

	public class Item {

		private final String id;
		private int quantity;

		public Item(String id, int quantity) {
			this.id = id;
			this.quantity = quantity;
		}

		public String getId() {
			return id;
		}

		public int getQuantity() {
			return quantity;
		}

	}

	void print(Item... items) {
		for (Item item : items) {
			System.out.println(
				item.getQuantity()
				+ "x "
				+ item.getId());
		}
	}


	// Improved annotation-based null analysis for fields

	@Nullable
	String field;

	void sample() {
		if (field == null) return;
		if (field.isEmpty()) {
			// ^ "Potential null pointer access" warning in the past
		}
	}

	void method() {
		field= null;
	}

	void sample(@Nullable String param) {
		if (param == null) return;
		method();
		if (param.isEmpty()) {
			// ...
		}
	}


	// Debugging:
	// - Highlighting for inline chained lambdas
	// - Drag and drop: Variables/Expressions => Debug Shell

	static Object[] sample(int param1, int param2, String... strings) {
		return Arrays
			.stream(strings).filter(s -> !s.isBlank()).map(s -> s.toUpperCase()).toArray();
	}

	public static void main(String[] args) {
		sample(1, 2, "aaa", " ", "CCC");
	}

}