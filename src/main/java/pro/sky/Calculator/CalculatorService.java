package pro.sky.Calculator;


import org.springframework.stereotype.Service;


@Service
public class CalculatorService {

    public String greetingsInCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    public int plusNumbers(Integer a, Integer b) {
        return a + b;
    }
    public int minusNumbers(Integer a, Integer b) {
        return a - b;
    }

    public int multiplyNumbers(Integer a, Integer b) {
        return a * b;
    }
    public Double divideNumbers(Integer a, Integer b) {
        if (b == 0) {
            throw new DivideByZeroException("Произведена попытка деления на ноль!");
        }
        return (double) a / (double) b;
    }

    public String buildResult(double a, double b, double result, String sign) {
        return a + " " + sign + " " + b + " = " + result;
    }

}
