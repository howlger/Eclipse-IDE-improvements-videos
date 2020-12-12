
public class HelloJava15 {
	
	public static void main(String[] args) {
		System.out.println("""
				Hello
				Java \
				15
				""");
	}
	
	// Preview Features:
	
	// 1. Pattern Matching for "instanceof"
	void foo(Object o) {
		if (o instanceof String s) {
			System.getProperty(s);
			System.out.println(s.trim().toLowerCase());
		}
	}
	
	// 2. Records
	record Point(int x, int y) {
		
	}
	
	// 3. Sealed Classes
	sealed class Node permits RootNode {
		
	}
	final class RootNode extends Node {
		
	}

}
