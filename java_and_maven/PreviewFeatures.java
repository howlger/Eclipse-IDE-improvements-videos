package java13;

import java.time.DayOfWeek;

public class PreviewFeatures {

	public static void main(String[] args) {
		String s = """

				""";
	}

	static void printShoppingHours(DayOfWeek day) {
		System.out.println(switch (day) {
		case MONDAY, WEDNESDAY: {

			yield "9 am to 5 pm";
		}
		default:
			yield """
					closed
					""";
		});
	}

}
