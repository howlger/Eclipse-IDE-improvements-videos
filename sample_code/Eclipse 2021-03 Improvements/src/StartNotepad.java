
public class StartNotepad {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting Notepad...");
		new ProcessBuilder("C:\\Windows\\notepad.exe").start();
		Thread.sleep(3_000);
	}

}
