package lesson_3.task_3_3;

import lesson_3.task_3_1.Scanner;

import java.util.ArrayList;
import java.util.List;

public class UniqueSymbols {

    private static boolean getUniqueWord(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void getWordWithUniqueSymbolsFromString() {

        var allStrings = Scanner.toScanningSystemIn();

        List<String> uniqueWords = new ArrayList<>();

        for (String str : allStrings) {
            var splitString = str.split("\\s+");

            for (String word : splitString) {
                if (getUniqueWord(word)) {
                    uniqueWords.add(word);
                }
            }
        }

        if (uniqueWords.isEmpty()) {
            System.out.println("Not found the word with unique symbols");
        } else {
            System.out.println("Word with unique symbols - " + uniqueWords.get(0));
        }
    }

    public static void main(String[] args) {

        getWordWithUniqueSymbolsFromString();
    }
}
