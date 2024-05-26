package lesson_3.task_3_1;

import java.util.Comparator;

public class LongestAndShortest {

    private static void getLongestAndShortestStrings() {

        var allStrings = Scanner.toScanningSystemIn();

        allStrings.stream()
            .min(Comparator.comparingInt(String::length))
            .ifPresentOrElse(str -> System.out.println("Shortest string - " + str + ". Length - " + str.length()),
                () -> System.out.println("Shortest string not found"));

        allStrings.stream()
            .max(Comparator.comparingInt(String::length))
            .ifPresentOrElse(str -> System.out.println("Longest string - " + str + ". Length - " + str.length()),
                () -> System.out.println("Longest string not found"));
    }

    public static void main(String[] args) {

        getLongestAndShortestStrings();
    }
}
