package lesson_6.task_6_1;

import lesson_6.task_6_1.exception.WrongLoginException;
import lesson_6.task_6_1.exception.WrongPasswordException;

public class AuthenticationValidator {

    private static boolean verificationLoginAndPassword(String login, String password, String confirmPassword) {

        if (login == null || login.isEmpty()) {
            throw new WrongLoginException("Login must is not be empty");
        } else if (login.matches(".*\\s+.*") || login.length() >= 20) {
            throw new WrongLoginException("Bad login");
        }

        if (password == null || password.isEmpty()) {
            throw new WrongPasswordException("Password must is not be empty");
        } else if (password.matches(".*\\s+.*") || password.length() >= 20 || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Bad password");
        }

        if (confirmPassword == null || confirmPassword.isEmpty()) {
            throw new WrongPasswordException("Password confirm field must is not be empty");
        } else if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Incorrect password confirmation");
        }

        return true;
    }
}
