package lesson_2.task_2_1;

public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("Audi", "petrol", 4, 300, "medium");
        sedan.start();
        sedan.stop();
        System.out.println(sedan.getFuelType());
        System.out.println(sedan.getNumberOfDoors());
        System.out.println(sedan.getTrunkCapacity());
        System.out.println(sedan.getLuxuryLevel());
        System.out.println();

        Truck truck = new Truck("KAMAZ", "diesel", 2, 20, 41);
        truck.start();
        truck.stop();
        System.out.println(truck.getFuelType());
        System.out.println(truck.getNumberOfDoors());
        System.out.println(truck.getTrunkCapacity());
        System.out.println(truck.getMaxLoadCapacity());
    }
}
