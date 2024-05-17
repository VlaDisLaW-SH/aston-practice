package lesson_2.task_2_1;

public class Truck extends Car {

    private Integer maxLoadCapacity;

    public Truck(String model, String fuelType, Integer doors, Integer trunk, Integer maxLoadCapacity) {
        super(model, fuelType, doors, trunk);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public void start() {
        System.out.println("the " + getModel() + " is moving");
    }

    @Override
    public void stop() {
        System.out.println("the " + getModel() + " is stopped");
    }

    @Override
    public String getFuelType() {
        return "Fuel type the " + getModel() + " is " + super.getFuelType();
    }

    @Override
    public String getNumberOfDoors() {
        return "Number of doors the " + getModel() + " is " + getDoors() + " pieces";
    }

    @Override
    public String getTrunkCapacity() {
        return "Body capacity the " + getModel() + " is " + getTrunk() + " cubic meters";
    }

    public String getMaxLoadCapacity() {
        return "Max load capacity the " + getModel() + " is " + this.maxLoadCapacity + " tons";
    }
}
