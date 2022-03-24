package edu.radziuk.util.str;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public boolean isPositiveNumber(String str) {
        return (NumberUtils.isCreatable(str))
                && NumberUtils.createInteger(str) > 0;
    }
}
