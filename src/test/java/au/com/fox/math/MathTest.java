package au.com.fox.math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    private static Stream<Arguments> fibonacciTestDataSource() {
        return Stream.of(
                Arguments.of(1, 1), Arguments.of(1, 2), Arguments.of(2, 3), Arguments.of(832040, 30), Arguments.of(21, 8), Arguments.of(0, 0));
    }

    @ParameterizedTest
    @MethodSource("fibonacciTestDataSource")
    public void testFibonacci(int expected, int input) {
        assertEquals(expected, new Math().fibonacci(input));
    }

}