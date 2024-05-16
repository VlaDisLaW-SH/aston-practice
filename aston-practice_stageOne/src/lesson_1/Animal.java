package lesson_1;

public class Animal {
    private String name;
    private Integer age;
    private Integer weight;

    public Animal(String name, Integer age, Integer weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal() {}

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void toEat() {
        System.out.println(getName() + " is fed");
    }

    public void toEat(String product) {
        System.out.println(getName() + " is fed of " + product);
    }

    public void toSleep() {
        System.out.println(getName() + " is sleep");
    }

    public void toSleep(Integer time) {
        System.out.println(getName() + " went to sleep in " + time);
    }
}
