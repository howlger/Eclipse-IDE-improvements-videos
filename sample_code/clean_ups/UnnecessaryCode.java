package clean_ups;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnnecessaryCode {
    short aShort;

    // (11/27) Use Objects.hash() (1.7 or higher)
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + aShort;
        return result;
    }

    int sample(String[] values, String s, boolean isValid, boolean isEnabled, int j) {

        // (12/27) Use String.join() when possible (1.8 or higher)
        boolean isFirst = true;
        StringBuilder concatenation = new StringBuilder();
        for (String text : values) {
            if (isFirst) {
                isFirst = false;
            } else {
                concatenation.append(", ");
            }
            concatenation.append(text);
        }
        String commaSeparated = "Values: " + concatenation.toString();

        // (13/27) Use Arrays.fill() when possible
        boolean[] array = new boolean[42];
        for (int i = 0; i < array.length; i++) {
            array[i] = true;
        }

        // (14/27) Evaluate without null check
        boolean b1 = s != null && "".equals(s);
        boolean b2 = null != s && "".equalsIgnoreCase(s);
        boolean b3 = s != null && s instanceof String;

        // (15/27) Double negation
        boolean b4 = !isValid == !isEnabled;
        boolean b5 = !isValid != !isEnabled;
        boolean b6 = !isValid ^ isEnabled;

        // (16/27) Remove redundant comparison statement
        if (j != 123) {
            return j;
        } else {
            return 123;
        }

    }

    // (17/27) Remove redundant super() call in constructor
    UnnecessaryCode() {
        super();
    }

    void sample(List<Integer> collection, Map<String, String> map) throws IOException {

        // (18/27) Initialize collection at creation
        List<Integer> list = new ArrayList<>();
        list.addAll(collection);

        // (19/27) Initialize map at creation
        Map<String, String> output = new HashMap<String, String>();
        output.putAll(map);

        // (20/27) Remove overridden assignment
        long time = 0;
        time = System.currentTimeMillis();

        // (21/27) Remove useless continue
        for (String key : map.keySet()) {
            System.out.println("key: " + key);
            continue;
        }

    }

    // (22/27) Use try-with-resource (1.7 or higher)
    void sample() throws IOException {
        final FileInputStream inputStream = new FileInputStream("out.txt");
        try {
            System.out.println(inputStream.read());
        } finally {
            inputStream.close();
        }
    }

}