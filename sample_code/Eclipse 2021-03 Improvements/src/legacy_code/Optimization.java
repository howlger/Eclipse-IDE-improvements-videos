package legacy_code;

public class Optimization {
	
	// (12/16) Convert fields into local variables if the use is only
	private int max;

	// (13/16) Make inner classes static where possible
	public class Inner {

		Object field;

		public boolean method() {
			return true;
		}

	}

	void sample(String text, int value1, int value2) {

		max= Math.max(value1, value2);
		System.out.println("max: " + max);
		
		// (14/16) Use String.replace() instead of String.replaceAll() when possible
		String result1= text.replaceAll("foo", "bar");
		String result2= text.replaceAll("&", "&amp;");
		String result3= text.replaceAll("[ab]", "c");

		// (15/16) Primitive comparison
		int comparison= Integer.valueOf(value1).compareTo(value2);

		// (16/16) Primitive parsing
		int number1= Integer.valueOf("42", 8);
		double number2= new Double("42.42").doubleValue();

	}
}