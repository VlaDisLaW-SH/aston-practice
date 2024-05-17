package lesson_2.task_2_1;

public class Sedan extends Car {

    private String luxuryLevel;

    public Sedan(String model, String fuelType, Integer doors, Integer trunk, String luxuryLevel) {
        super(model, fuelType, doors, trunk);
        this.luxuryLevel = luxuryLevel;
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
        return "Trunk capacity the " + getModel() + " is " + getTrunk() + " liters";
    }

    public String getLuxuryLevel() {
        return "Luxury level of the " + getModel() + " is " + this.luxuryLevel;
    }
}
