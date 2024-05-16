package lesson_1;

public class Dog extends Animal {

    {
        setName("Finn");
        setAge(5);
        setWeight(10);
        System.out.println("Non-static block initialized");
    }

    @Override
    public void toEat() {
        System.out.println(getName() + " overeated and wants to sleep!");
    }
}
