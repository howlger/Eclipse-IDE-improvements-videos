package legacy_code;

import java.util.List;

public class CodeStyle {
	void sample(int j, boolean isValid, boolean isEnabled, int number,
			List<String> inputList, List<String> outputList, int value) {
		
		// (1/27) Convert to switch expression (Java 14 or higher)
		int i;
		switch(j) {
		case 1:
			i = 3;
			break;
		case 2:
			i = 4;
			break;
		default:
			i = 0;
			break;
		}
		//
		// (2/27) Combine nested 'if' statement in 'else' block to 'else if'
		if (isValid) {
			System.out.println(isValid);
		} else {
			if (isEnabled) {
				System.out.println(isEnabled);
			}
		}
		
		// (3/27) Convert if/else if/else chain to switch
		int k, m;
		if (number == 0) {
			i = 0;
		} else if (number == 1) {
			j = 10;
		} else if (2 == number) {
			k = 20;
		} else {
			m = -1;
		}
		
		// (4/27) Add elements in collections without loop
		for (int n = 0; n < inputList.size(); n++) {
			outputList.add(inputList.get(n));
		}
	}
	
	public static final int CONSTANT = 1 << 3;
	void sample(int value, List<String> list, Object o) {
		
		// (5/27) Compare with != 0 for bitwise expressions (use it carefully, it may alter the behavior)
		if ((value & CONSTANT) > 0) {}

		// (6/27) Pull up assignment
		boolean isRemoved;
		if (isRemoved = list.remove(o)) {}
		
	}
}