import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
class Sample {

	void report(Issue issue) {
		
	}

	// Preferences: "Java > Editor > Folding: Extended folding"
	public String[] split(String regex, CharSequence input, int limit, boolean withDelimiters) {
		int matchCount = 0;
		int index = 0;
		boolean matchLimited = limit > 0;
		var matchList = new ArrayList<String>();
		var m = Pattern.compile(regex).matcher(input);

		// Add segments before each match found
		while(m.find()) {
			if (!matchLimited || matchCount < limit - 1) {
				if (index == 0 && index == m.start() && m.start() == m.end()) {
					// no empty leading substring included for zero-width match
					// at the beginning of the input char sequence.
					continue;
				}
				String match = input.subSequence(index, m.start()).toString();
				matchList.add(match);
				index = m.end();
				if (withDelimiters) {
					matchList.add(input.subSequence(m.start(), index).toString());
				}
				++matchCount;
			} else if (matchCount == limit - 1) { // last one
				String match = input.subSequence(index, input.length()).toString();
				matchList.add(match);
				index = m.end();
				++matchCount;
			}
		}

		// If no match was found, return this
		if (index == 0)
			return new String[] {input.toString()};

		// Add remaining segment
		if (!matchLimited || matchCount < limit)
			matchList.add(input.subSequence(index, input.length()).toString());

		// Construct result
		int resultSize = matchList.size();
		if (limit == 0) {
			while (resultSize > 0 && matchList.get(resultSize-1).isEmpty()) {
				resultSize--;
			}
		}
		String[] result = new String[resultSize];
		return matchList.subList(0, resultSize).toArray(result);
	}

	// Variables view: compare, exceptions with stack traces and custom formatters for primitives
	public static void main(String... args) {
		sample(1, 2, 3);
	}
	public static void sample(int... numbers) {

		// lists
		var list1 = List.of("aaa", "bbb", "ccc");
		var list2 = new ArrayList<String>(list1);
		var list3 = new ArrayList<String>();
		list2.remove(1);
		list3.addAll(list1);

		// objects
		var a = new Point();
		var b = new Point();
		a.x = b.x = 2;
		b.y = 7;

		try {
			System.out.println(numbers[3]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
