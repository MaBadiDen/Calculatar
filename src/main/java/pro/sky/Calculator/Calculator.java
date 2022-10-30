package pro.sky.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String greetingsInCalculator() {
        return calculatorService.greetingsInCalculator();
    }
    @GetMapping(path = "/calculator/plus")
    public String plusNumbers(@RequestParam(name = "num1", required = false) Integer a , @RequestParam(name = "num2", required = false) Integer b) {
        if(b == null || a == null) {
            return "Не введен один или оба параметра!";
        }
        return calculatorService.plusNumbers(a, b);
    }
    @GetMapping(path = "/calculator/minus")
    public String minusNumbers(@RequestParam(name = "num1", required = false) Integer a, @RequestParam(name = "num2", required = false) Integer b) {
        if(b == null || a == null) {
            return "Не введен один или оба параметра!";
        }
        return calculatorService.minusNumbers(a, b);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplyNumbers(@RequestParam(name = "num1", required = false) Integer a, @RequestParam(name = "num2", required = false) Integer b) {
        if(b == null || a == null) {
            return "Не введен один или оба параметра!";
        }
        return calculatorService.multiplyNumbers(a, b);
    }
    @GetMapping(path = "/calculator/divide")
    public String divideNumbers(@RequestParam(name = "num1", required = false) Integer a, @RequestParam(name = "num2", required = false) Integer b) {
        if(b == null || a == null) {
            return "Не введен один или оба параметра!";
        }
        try {
            return calculatorService.divideNumbers(a, b);
        } catch (Throwable e) {
            return e.getMessage();
        }
    }
}
