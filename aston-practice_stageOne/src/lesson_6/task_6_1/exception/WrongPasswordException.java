package lesson_6.task_6_1.exception;

public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException() {};

    public WrongPasswordException(String message) {
        super(message);
    }
}
