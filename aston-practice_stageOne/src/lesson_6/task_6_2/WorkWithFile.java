package lesson_6.task_6_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFile {

    private static void writeStringFromConsoleInFile() throws IOException {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        try (FileOutputStream outputStream = new FileOutputStream("src\\lesson_6\\task_6_2\\tms.txt", false)) {
            var bytes = text.getBytes();
            outputStream.write(bytes, 0, bytes.length);
            outputStream.flush();
        }
    }

    private static void readFromFile() throws IOException {

        FileInputStream reader = new FileInputStream("src\\lesson_6\\task_6_2\\tms.txt");
        String line = new String(reader.readAllBytes());
        String updateLine = line.replace(' ', '_');
        System.out.println(updateLine);
        reader.close();
    }
}
