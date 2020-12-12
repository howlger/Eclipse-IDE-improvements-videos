package legacy_code;

public class Optimization {
    void sample(int number, char letter) {

        // (23/27) Exit loop earlier
        boolean isFound = false;
        for (int i = 0; i < number; i++) {
            if (i == 42) {
                isFound = true;
            }
        }

        // (24/27) Replace String concatenation by StringBuilder
        String variable = "";
        variable = variable + "foo";
        variable += "bar";
        String message = variable + ".";

        // (25/26) Primitive serialization
        String text1 = Integer.valueOf(number).toString();
        String text2 = Character.valueOf(letter).toString();

        // (26/27) Remove unnecessary String creation
        String bar = new String("foo");

        // (27/27) Prefer boolean literals
        boolean isActive = Boolean.TRUE;

    }
}