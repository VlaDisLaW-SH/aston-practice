package lesson_3.task_3_2;

import lesson_3.task_3_1.Scanner;

public class AverageLength {

    private static void getLengthOfStringLessThanAverage() {

        var allStrings = Scanner.toScanningSystemIn();

        var totalLength = allStrings.stream()
            .map(String::length)
            .reduce(0, (subtotal, element) -> subtotal + element);

        var generalAverageLength = totalLength / allStrings.size();

        allStrings.stream()
            .filter(str -> str.length() < generalAverageLength)
            .forEach(str -> System.out.println("Length less than average - " + str + ". Length - " + str.length()));
    }

    public static void main(String[] args) {

        getLengthOfStringLessThanAverage();
    }
}
