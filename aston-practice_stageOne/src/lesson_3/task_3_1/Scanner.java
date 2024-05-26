package lesson_3.task_3_1;

import java.util.ArrayList;
import java.util.List;

public class Scanner {

    public static List<String> toScanningSystemIn() {

        int countOfString = 3;

        List<String> listStrings = new ArrayList<>();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите три строки:");

        while (countOfString > 0) {
            listStrings.add(scanner.nextLine());
            countOfString--;
        }

        scanner.close();

        return listStrings;
    }
}
