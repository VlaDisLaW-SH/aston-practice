package lesson_4.task_4_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {

        List<String> countriesOfWorld = new ArrayList<>(Arrays.asList("Russia", "America", "China", "England", "France"));

        countriesOfWorld.add("Germany");
        countriesOfWorld.add("Switzerland");
        countriesOfWorld.add("Norway");

        System.out.println(countriesOfWorld);

        countriesOfWorld.set(1, "Sweden");
        countriesOfWorld.remove(1);
        countriesOfWorld.remove("France");

        countriesOfWorld.indexOf("China");
        countriesOfWorld.contains("Russia");
    }
}
