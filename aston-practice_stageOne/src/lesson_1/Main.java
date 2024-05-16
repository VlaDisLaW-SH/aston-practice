package lesson_1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 2, 3);
        cat.toEat();
        cat.toEat("fish");
        cat.toSleep();
        cat.toSleep(10);

        Dog dog = new Dog();
        System.out.println(dog.getName());
        System.out.println("Weight of the Dog " + dog.getWeight());
        dog.setName("Max");
        dog.toEat();
    }
}
