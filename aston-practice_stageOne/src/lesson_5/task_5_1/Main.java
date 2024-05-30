package lesson_5.task_5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, -5, 0, 6, 1, 0, -2, 10, 3, 6));

        var updateNumbers = numbers.stream()
            .distinct()
            .filter(number -> number % 2 == 0)
            .reduce(0, Integer::sum);

        System.out.println(updateNumbers);
    }
}
