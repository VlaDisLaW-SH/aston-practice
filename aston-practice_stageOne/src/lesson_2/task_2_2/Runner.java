package lesson_2.task_2_2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ImmutablePerson immutablePerson = new ImmutablePerson("James", 30, List.of("Fishing", "Collecting", "Golf"));

        System.out.println(immutablePerson.getName());
        System.out.println(immutablePerson.getHobbies());
        System.out.println();

        MutablePerson mutablePerson = new MutablePerson("Jack", 31, new ArrayList<>());
        System.out.println(mutablePerson.getName());
        System.out.println(mutablePerson.getAge());
        mutablePerson.addHobby("Hunting");
        mutablePerson.addHobby("Collecting");
        System.out.println(mutablePerson.getHobbies());

        mutablePerson.setAge(33);
        mutablePerson.addHobby("Diving");
        System.out.println(mutablePerson.getAge());
        System.out.println(mutablePerson.getHobbies());
    }
}
