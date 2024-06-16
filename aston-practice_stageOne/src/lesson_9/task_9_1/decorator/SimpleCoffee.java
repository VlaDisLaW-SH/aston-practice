package lesson_9.task_9_1.decorator;

public class SimpleCoffee implements Coffee {

    public String getDescription() {
        return "Простой кофе";
    }

    public double cost() {
        return 50;
    }
}
