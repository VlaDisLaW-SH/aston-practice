package lesson_9.task_9_1.decorator;

public class CoffeeWithSugar extends CoffeeDecorator {

    public CoffeeWithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", с сахаром";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 10;
    }
}
