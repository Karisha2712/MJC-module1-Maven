package edu.radziuk.util.str;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void ifIsPositiveNumberReturnsFalse() {
        StringUtils stringUtils = new StringUtils();
        String parameter = "-5";
        boolean actual = stringUtils.isPositiveNumber(parameter);
        Assert.assertFalse(actual);
    }
}
