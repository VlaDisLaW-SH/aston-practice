package lesson_1;

public class Cat extends Animal {

    static {
        System.out.println("A typical feline");
    }

    public Cat(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 2, 3);

        cat.toEat();
        cat.toEat("fish");
        cat.toSleep();
        cat.toSleep(10);
    }
}
