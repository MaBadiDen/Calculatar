package pro.sky.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Calculator {
    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetingsInCalculator() {
        return calculatorService.greetingsInCalculator();
    }
    @GetMapping(path = "/plus")
    public String plusNumbers(@RequestParam(name = "num1", required = false) Integer a , @RequestParam(name = "num2", required = false) Integer b) {
        if(b == null || a == null) {
            return "Не введен один или оба параметра!";
        }
        return a + " + " + b + " = " + calculatorService.plusNumbers(a, b);
    }
    @GetMapping(path = "/minus")
    public String minusNumbers(@RequestParam(name = "num1", required = false) Integer a, @RequestParam(name = "num2", required = false) Integer b) {
        if(b == null || a == null) {
            return "Не введен один или оба параметра!";
        }
        return a + " - " + b + " = " + calculatorService.minusNumbers(a, b);
    }
    @GetMapping(path = "/multiply")
    public String multiplyNumbers(@RequestParam(name = "num1", required = false) Integer a, @RequestParam(name = "num2", required = false) Integer b) {
        if(b == null || a == null) {
            return "Не введен один или оба параметра!";
        }
        return a + " * " + b + " = " + calculatorService.multiplyNumbers(a, b);
    }
    @GetMapping(path = "/divide")
    public String divideNumbers(@RequestParam(name = "num1", required = false) Integer a, @RequestParam(name = "num2", required = false) Integer b) {
        if(b == null || a == null) {
            return "Не введен один или оба параметра!";
        } else if (b == 0) {
            return "На ноль делить нельзя, сволочь!";
        } else {
            return a + " / " + b + " = " + calculatorService.divideNumbers(a, b);
        }
    }
}
