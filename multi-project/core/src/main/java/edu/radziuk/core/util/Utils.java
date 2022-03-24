package edu.radziuk.core.util;

import edu.radziuk.util.str.StringUtils;

import java.util.Arrays;

public final class Utils {
    private Utils() {
    }

    public static boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();
        return Arrays.stream(str).allMatch(stringUtils::isPositiveNumber);
    }
}
