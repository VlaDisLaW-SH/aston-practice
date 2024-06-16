package lesson_9.task_9_1.decorator;

public class CoffeeWithMilk extends CoffeeDecorator {

    public CoffeeWithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", с молоком";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 20;
    }
}
