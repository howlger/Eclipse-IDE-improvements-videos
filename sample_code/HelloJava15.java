
public class HelloJava15 {

    public static void main(String[] args) {
        System.out.println("""
                Hello   \s
                Java \
                15
                """);
    }

    // Java 15 Preview Features:

    void foo(Object o) {
        // 1. Pattern Matching for instanceof
        if (o instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }

    // 2. Records
    record Point(int x, int y) {
        int distanceX(Point p2) {
            return x - p2.x();
        }
    }

    // 3. Sealed Classes
    sealed class Node permits RootNode {

    }

    final class RootNode extends Node {

    }

}