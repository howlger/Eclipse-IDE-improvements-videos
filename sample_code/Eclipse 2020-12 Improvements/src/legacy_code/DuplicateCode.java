package legacy_code;

public class DuplicateCode {
    int sample(int i, boolean isValid, boolean isEnabled, Boolean isDone) {

        // (7/27) Replace (X && Y) || (!X && Z) by X ? Y : Z
        boolean result = (0 < i) && isValid || (i <= 0) && isEnabled;

        // (8/27) Use '==' or '^' on booleans
        boolean newBoolean1 = isDone && (i > 0) || !isDone && (i <= 0);
        boolean newBoolean2 = !isDone && isEnabled || isDone && !isEnabled;

        // (9/27) Remove redundant end of block with jump statement
        if (0 < i) {
            System.out.println("Doing something");
            return i + 10;
        }
        return i + 10;
    }
    void sample(boolean isValid) {

        // (10/27) Redundant if condition
        if (isValid) {
            System.out.println("valid");
        } else if (!isValid) {
            System.err.println("invalid");
        }

    }
}