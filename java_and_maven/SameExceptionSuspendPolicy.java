package java13legacy;

import java.util.concurrent.Callable;

public class SameExceptionSuspendPolicy {
	
	public static void main(String[] args) throws Throwable {
		for (int i = 1; i <= 3; i++) {
			try {
				System.out.println(i);
				System.out.println(execute(() ->
				    System.getenv("FOO").toUpperCase() // NPE
				));
			} catch (Throwable t) {
				// TODO error handling
			}
		}
	}
	
	static String execute(Callable<String> task) {
		try {
			return task.call();
		} catch (RuntimeException | Error e) {
			throw e; // rethrow unchecked exceptions
		} catch (Exception e) {
			return null; // null for checked exceptions
		}
	}
	
}
