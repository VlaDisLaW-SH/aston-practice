package lesson_4.task_4_3;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Person> people = new HashSet<>();

        Person person1 = new Person("Иван", "Иванов");
        Person person2 = new Person("Петр", "Петров");
        Person person3 = new Person("Роман", "Романов");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person item : people) {
            System.out.println(item.getFirstName() + " " + item.getLastName());
        }

        people.remove(person1);
        people.remove(person3);

        System.out.println(people.contains(person2));
    }
}
