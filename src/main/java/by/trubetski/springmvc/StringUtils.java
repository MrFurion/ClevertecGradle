package by.trubetski.springmvc;

import javax.annotation.processing.Generated;

public class StringUtils {

    @Generated("JacocoExclude")
    private StringUtils() {
    }

    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            return Double.parseDouble(str) >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
