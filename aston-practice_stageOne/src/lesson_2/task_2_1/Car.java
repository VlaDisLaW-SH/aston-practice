package lesson_2.task_2_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Car implements Vehicle {

    private String model;
    private String fuelType;
    private Integer doors;
    private Integer trunk;

    public abstract String getNumberOfDoors();

    public abstract String getTrunkCapacity();
}
