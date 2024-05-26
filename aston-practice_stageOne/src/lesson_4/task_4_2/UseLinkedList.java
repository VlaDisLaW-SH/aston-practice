package lesson_4.task_4_2;

import java.util.Arrays;
import java.util.LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {

        LinkedList<String> countriesOfWorld = new LinkedList<>(Arrays.asList("Russia", "America", "China"));

        countriesOfWorld.addFirst("Germany");
        countriesOfWorld.addFirst("Switzerland");
        countriesOfWorld.addLast("Norway");
        countriesOfWorld.addLast("England");
        System.out.println(countriesOfWorld);

        countriesOfWorld.removeFirst();
        countriesOfWorld.removeLast();

        System.out.println(countriesOfWorld.getFirst());
        System.out.println(countriesOfWorld.getLast());
    }
}
