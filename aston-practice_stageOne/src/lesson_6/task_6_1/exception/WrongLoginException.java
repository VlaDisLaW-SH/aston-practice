package lesson_6.task_6_1.exception;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException() {}

    public WrongLoginException(String message) {
        super(message);
    }
}
