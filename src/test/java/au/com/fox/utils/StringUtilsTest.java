package au.com.fox.utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private static Stream<Arguments> reverseTestDataSource() {
        return Stream.of(
                Arguments.of("abcdef", "fedcba"), Arguments.of("a", "a"), Arguments.of("", ""), Arguments.of("aabaa", "aabaa") );
    }

    @ParameterizedTest
    @MethodSource("reverseTestDataSource")
    void reverse(String reverseString, String expectedOutput) {
        assertEquals("fedcba", new StringUtils().reverse("abcdef"));
    }
}