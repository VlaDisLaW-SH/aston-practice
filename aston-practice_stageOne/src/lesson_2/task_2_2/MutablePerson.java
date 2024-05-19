package lesson_2.task_2_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class MutablePerson {

    private String name;
    private Integer age;
    private List<String> hobbies;

    public void addHobby(String hobby) {

        List<String> updateHobbies = this.hobbies;
        updateHobbies.add(hobby);
    }
}
