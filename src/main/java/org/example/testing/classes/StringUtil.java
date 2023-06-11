package org.example.testing.classes;

public class StringUtil {

    public static String repeat (String x, int a) {

        if(a < 0) {
            throw new IllegalArgumentException("Number must be bigger than zero");
        }

        String repeated = new String();
        for (int i = 0; i < a; i++) {
            repeated += x;
        }
        return repeated;
    }

}
