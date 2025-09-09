import java.util.TimerTask;

public class Timer {

	private static int totalSeconds = 3 * 60; // 3 minutes in seconds

	public static void main(String[] args) {
		var start= System.currentTimeMillis();
		var timer = new java.util.Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				totalSeconds--;

				if (totalSeconds < 0) {
					System.out.println("\nTime's up!");
					timer.cancel();
					return;
				}

				// Clear the previous line and print new time
				System.out.print("\r");
				long totalRemainingSeconds = (System.currentTimeMillis() - start) / 1000;
				int minutes = (int) (totalRemainingSeconds / 60);
				int seconds = (int) (totalRemainingSeconds % 60);
				System.out.printf("%02d:%02d", minutes, seconds);
			}
		}, 0, Countdown.delay);
	}

}