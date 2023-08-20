package lesson28.exeption;

// Exception - семейство исключений которые необходимо проверять
public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

