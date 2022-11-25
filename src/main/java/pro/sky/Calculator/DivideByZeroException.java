package pro.sky.Calculator;


public class DivideByZeroException extends IllegalArgumentException{
    public DivideByZeroException(String message) {
        super(message);
    }
}
