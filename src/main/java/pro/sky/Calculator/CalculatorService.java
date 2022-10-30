package pro.sky.Calculator;


import org.springframework.stereotype.Service;


@Service
public class CalculatorService {

    public String greetingsInCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    public String plusNumbers(Integer a, Integer b) {
        int sum = a + b;
        return a + " + " + b + " = " + sum;
    }
    public String minusNumbers(Integer a, Integer b) {
        int difference = a - b;
        return a + " - " + b + " = " + difference;
    }

    public String multiplyNumbers(Integer a, Integer b) {
        int product = a * b;
        return a + " * " + b + " = " + product;
    }
    public String divideNumbers(Integer a, Integer b) {
        double quotient = (double) a / (double) b;
        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя, сволочь!");
        }

        return a + " / " + b + " = " + quotient;



    }

}
