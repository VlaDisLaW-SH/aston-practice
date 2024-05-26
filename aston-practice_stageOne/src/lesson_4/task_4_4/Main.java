package lesson_4.task_4_4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Ivan", "A", 2,
            Map.of("Mathematics", 4.5, "Physics", 4.1, "Biology", 3.9));

        Student student2 = new Student("Peter", "A", 2,
            Map.of("Mathematics", 2.9, "Physics", 2.7, "Biology", 3.0));

        Student student3 = new Student("Roman", "B", 1,
            Map.of("Mathematics", 4.1, "Physics", 4.3, "Biology", 3.3));

        Student student4 = new Student("Oleg", "C", 1,
            Map.of("Mathematics", 3.0, "Physics", 2.6, "Biology", 2.9));

        Student student5 = new Student("Paul", "B", 3,
            Map.of("Mathematics", 4.0, "Physics", 4.2, "Biology", 4.1));

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("Before transfer");
        Student.printStudents(students, 2);

        var updateStudents = Student.transferOfStudentToNextCourse(students);

        System.out.println("After transfer");
        Student.printStudents(updateStudents, 2);
    }
}
