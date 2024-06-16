package lesson_9.task_9_1.decorator;

public class Runner {

    public static void main(String[] args) {

        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription()
            + " стоит " + simpleCoffee.cost() + " руб.");

        Coffee milkCoffee = new CoffeeWithMilk(simpleCoffee);
        System.out.println(milkCoffee.getDescription()
            + " стоит " + milkCoffee.cost() + " руб.");

        Coffee sugarMilkCoffee = new CoffeeWithSugar(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription()
            + " стоит " + sugarMilkCoffee.cost() + " руб.");
    }
}
