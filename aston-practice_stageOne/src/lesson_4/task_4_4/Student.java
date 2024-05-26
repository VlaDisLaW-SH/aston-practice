package lesson_4.task_4_4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Student {

    private String name;
    private String group;
    private Integer course;
    private Map<String, Double> subjectGrades;

    public static List<Student> transferOfStudentToNextCourse(List<Student> students) {

        List<Student> updateListStudents = new ArrayList<>();

        for (Student student : students) {
            double totalScore = 0.0;
            for (Double value : student.subjectGrades.values()) {
                totalScore += value;
            }

            double overallGpa = totalScore / student.subjectGrades.size();
            if (overallGpa >= 3.0) {
                student.setCourse(student.getCourse() + 1);
                updateListStudents.add(student);
            }
        }

        return updateListStudents;
    }

    public static void printStudents(List<Student> students, int course) {

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " is studying on the course - " + course);
            }
        }
    }
}
