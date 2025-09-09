public class Countdown implements Runnable {

	public static void main(String[] args) {
//		System.out.println("Countdown...");
		new Countdown(3).run();
		new Countdown().run();
	}

	//# Fields

	/** @deprecated Use {@link Settings#delay} instead. */
	@Deprecated
	static int delay= 200;

	private final int start;

	//# Constructors
	Countdown()
	{
		this.start= 10;
	}
	Countdown(int start) {
		this.start= start;
	}

	//# Methods
	@Override
	public void run() {
		for (int i= start; i > 0; i--) {
			System.out.println(i);

			//# Sleep...
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// ignore
			}

		}
	}

}