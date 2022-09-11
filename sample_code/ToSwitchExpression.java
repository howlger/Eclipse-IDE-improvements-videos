class ToSwitchExpression {
	enum Level { A, B, C, D, E; }

	// as in the past ...
	int getScoring(Level level, int bonus) {
		int scores;
		switch (level) {
		case A:
		case B:
			scores = -1;
			break;
		case C:
			// ...
			System.out.println("...");
			scores = 42;
			break;
		default:
			throw new IllegalArgumentException(level.name());
		}
		return scores + bonus;
	}

	// ... now also ...
	int getLevelFactor(Level level) {
		switch (level) {
		case A:
		case B:
			return -1;
		case C:
			// ...
			System.out.println("...");
			return 42;
		default:
			throw new IllegalArgumentException(level.name());
		}
	}

}