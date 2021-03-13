package legacy_code;

public class CodeStyle {
	void sample(int number, int countdown) {

		// (6/16) Reduce indentation when possible
		if (number < 1) {
			return;
		} else {
			doStuff();
		}
		if (number >= 1) {
			doStuff();
		} else {
			return;
		}

		// (7/16) Extract increment/decrement from statement

		boolean done= --countdown <= 0;

	}
	void doStuff() {}
}