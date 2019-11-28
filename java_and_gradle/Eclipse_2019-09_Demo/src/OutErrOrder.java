public class OutErrOrder {

	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			System.out.println(i + " out");
			System.err.println(i + " err");
		}
	}

}