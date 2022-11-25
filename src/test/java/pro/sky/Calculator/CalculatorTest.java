package pro.sky.Calculator;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;


public class CalculatorTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest() {
        int sum = calculatorService.plusNumbers(1, 2);
        assertThat(sum).isEqualTo(3);

        sum = calculatorService.plusNumbers(3, 5);
        assertThat(sum).isEqualTo(8);
    }

    @Test
    public void minusTest() {
        int diff = calculatorService.minusNumbers(1, 2);
        assertThat(diff).isEqualTo(-1);

        diff = calculatorService.minusNumbers(5, 5);
        assertThat(diff).isEqualTo(0);
    }

    @Test
    public void multiplyTest() {
        int product = calculatorService.multiplyNumbers(1, 2);
        assertThat(product).isEqualTo(2);

        product = calculatorService.multiplyNumbers(3, 5);
        assertThat(product).isEqualTo(15);
    }


    @Test
    public void dividePositiveTest() {
        double quotient = calculatorService.divideNumbers(1, 2);
        assertThat(quotient).isEqualTo(0.5);

        quotient = calculatorService.divideNumbers(6, 3);
        assertThat(quotient).isEqualTo(2);
    }

    @Test
    public void divideNegativeTest() {
        assertThatExceptionOfType(DivideByZeroException.class)
                .isThrownBy(() -> calculatorService.divideNumbers(1, 0))
                .withMessage("Произведена попытка деления на ноль!");

        assertThatExceptionOfType(DivideByZeroException.class)
                .isThrownBy(() -> calculatorService.divideNumbers(3, 0))
                .withMessage("Произведена попытка деления на ноль!");
    }

}
