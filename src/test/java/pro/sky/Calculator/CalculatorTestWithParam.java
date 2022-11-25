package pro.sky.Calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CalculatorTestWithParam {

    private final CalculatorService calculatorService = new CalculatorService();
    @ParameterizedTest
    @MethodSource("paramsForPlus")
    public void plusTest(int a, int b, int expResult) {
        assertThat(calculatorService.plusNumbers(a, b)).isEqualTo(expResult);
    }

    public static Stream<Arguments> paramsForPlus() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(5, 8, 13),
                Arguments.of(21, 34, 55),
                Arguments.of(89, 144, 233)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForMinus")
    public void minusTest(int a, int b, int expResult) {
        assertThat(calculatorService.minusNumbers(a, b)).isEqualTo(expResult);
    }

    public static Stream<Arguments> paramsForMinus() {
        return Stream.of(
                Arguments.of(1, 2, -1),
                Arguments.of(5, 8, -3),
                Arguments.of(2, 1, 1),
                Arguments.of(7, 5, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForMultiply")
    public void multiplyTest(int a, int b, int expResult) {
        assertThat(calculatorService.multiplyNumbers(a, b)).isEqualTo(expResult);
    }

    public static Stream<Arguments> paramsForMultiply() {
        return Stream.of(
                Arguments.of(1, 2, 2),
                Arguments.of(5, 8, 40),
                Arguments.of(21, 34, 714),
                Arguments.of(89, 144, 12816)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForDivide")
    public void divideTest(int a, int b, double expResult) {
        assertThat(calculatorService.divideNumbers(a, b)).isEqualTo(expResult);
    }

    public static Stream<Arguments> paramsForDivide() {
        return Stream.of(
                Arguments.of(1, 2, 0.5),
                Arguments.of(8, 4, 2),
                Arguments.of(21, 7, 3),
                Arguments.of(81, 9, 9)
        );
    }
}
