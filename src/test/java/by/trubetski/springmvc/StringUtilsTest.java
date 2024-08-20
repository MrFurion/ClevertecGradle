package by.trubetski.springmvc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("123"));
        assertTrue(StringUtils.isPositiveNumber("0"));
        assertTrue(StringUtils.isPositiveNumber("2.3"));
        assertFalse(StringUtils.isPositiveNumber("-123"));
        assertFalse(StringUtils.isPositiveNumber(null));
        assertFalse(StringUtils.isPositiveNumber(""));
        assertFalse(StringUtils.isPositiveNumber("  "));
        assertFalse(StringUtils.isPositiveNumber("a123"));
        assertFalse(StringUtils.isPositiveNumber("123a"));

    }
}