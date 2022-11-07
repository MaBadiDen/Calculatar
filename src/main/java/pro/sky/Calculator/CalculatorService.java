package pro.sky.Calculator;


import org.springframework.stereotype.Service;


@Service
public class CalculatorService {

    public String greetingsInCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    public Integer plusNumbers(Integer a, Integer b) {
        return a + b;
    }
    public Integer minusNumbers(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiplyNumbers(Integer a, Integer b) {
        return a * b;
    }
    public double divideNumbers(Integer a, Integer b) {
        return (double) a / (double) b;



    }

}
