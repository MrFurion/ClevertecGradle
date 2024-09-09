package by.trubetski.springmvc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"123", "0", "2.3"})
    void testIsPositiveNumber_PositiveCases(String input) {
        assertTrue(StringUtils.isPositiveNumber(input), "Expected positive number: " + input);
    }

    @ParameterizedTest
    @ValueSource(strings = {"-123", "", "  ", "a123", "123a"})
    @NullSource
    void testIsPositiveNumber_NegativeCases(String input) {
        assertFalse(StringUtils.isPositiveNumber(input), "Expected non-positive number: " + input);
    }
}