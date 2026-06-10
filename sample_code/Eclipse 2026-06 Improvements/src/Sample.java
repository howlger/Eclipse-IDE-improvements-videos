import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

class Sample {

	// Quick assist: Convert String to Text Block
	String asciiArt= " ()_()\n(='.'=)\n(\")_(\")";


	// Quick assist: Replace qualified name
	java.time.LocalDate date= java.time.LocalDate.now();


	// Quick fix: Change ... to '@NonNull' 
	@NonNull String sample(@Nullable String str) {
		return "";
	}

	@Nullable String str() {
		return "";
	}

	@Nullable String str2() {
		return null;
	}


	// Refactoring/quick fix improved: Convert Class to Record
	class Item {

		private final String name;
		private int quantity;

		public Item(String name, int quantity) {
			this.name = name;
			this.quantity = quantity;
		}

		public Item(String name) {
			this(name, 0);
		}

		public String getName() {
			return name;
		}

		public int getQuantity() {
			return quantity;
		}

		public boolean isAvailable() {
			return quantity > 0;
		}

	}


	// Debugging: Filter intermediate instructions while stepping
	public static void main(String[] args) {
		var dot= ".";
		print(
				dot,        // intermediate
				Util.add(
						1,  // intermediate
						2)  // intermediate
				);
	}

	static void print(String text, int count) {
		System.out.println(text.repeat(count));
	}


	// Compare editor: Semantic highlighting for local Java files
	@Deprecated void sample() {}


	// Zero-width spaces and characters (ZWSP)
	public static final String ZWSP = "​";

}