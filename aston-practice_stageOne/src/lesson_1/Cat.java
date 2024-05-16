package lesson_1;

public class Cat extends Animal {

    static {
        System.out.println("Static block initialized");
        System.out.println("A typical feline");
    }

    public Cat(String name, Integer age, Integer weight) {
        super(name, age, weight);
    }
}
