import static java.lang.Integer.valueOf;
import static java.util.Arrays.stream;

class Countdown {

	Integer state;

	Countdown() {

		stream(new Integer[]{ 3, 2, 1 }).forEach(i -> {
			state = i;
			System.out.println(state);
		});

	}

	public static void main(String[] args) {
		new Countdown();
		System.out.println("1 + 1 = " + valueOf(2));
	}

}