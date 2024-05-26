package lesson_3.task_3_4;

public class DuplicateCharacters {

    private static String toDuplicate(String word) {

        StringBuilder duplicateCharacters = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            duplicateCharacters
                .append(word.charAt(i))
                .append(word.charAt(i));
        }
        return duplicateCharacters.toString();
    }

    public static void main(String[] args) {

        System.out.println(toDuplicate("Hello"));
    }
}
