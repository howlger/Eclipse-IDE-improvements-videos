class Sample {

	// Improved clean-up:
	// Code Style > Convert if/else if/else chain with 3 blocks min to switch
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("+++++++++\n");
		builder.append("+ Hello +\n");
		builder.append("+ World +\n");
		builder.append("+++++++++\n");
		write(builder); // in the past only when: write(builder.toString())
		write("end.");
	}
	static void write(CharSequence sequence) {
		System.out.println(sequence);
	}

	// Improved clean-up:
	// Java Features > Java 15 > Convert String concatenation to Text Block
	//   > Include StringBuffer or StringBuilder concatenations
	int getLevel(String x) {
		int level;
		if (x.equals("green") || x.equals("one")) {
			level = 1;
		} else if (x.equals("yellow") || x.equals("two")) {
			level = 2;
		} else if (x.equals("red") || x.equals("three")) {
			level = 3;
		} else {
			level = 0;
		}
		return level;
	}

	enum Color { WHITE, GREEN, YELLOW, RED }
	int getLevel(Color color) {
		int level;
		if (color == Color.GREEN) {
			level = 1;
		} else if (color == Color.YELLOW) {
			level = 2;
		} else if (color == Color.RED) {
			level = 3;
		} else {
			level = 0;
		}
		return level;
	}

}
