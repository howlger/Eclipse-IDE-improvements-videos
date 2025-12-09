public class ConsoleSample {
	public static void main(String[] args) throws Exception {
		int sec = 16;
		if (args.length == 0) {
			for (int i = 0; i < (sec / 2); i++) {
				for (int j = 0; j < 25; j++) {
					System.out.print(".");
					Thread.sleep(80);
				}
				System.out.println();
			}
		} else {
			for (int i = sec; i >= 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);

			}
		}
	}
}