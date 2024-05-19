package lesson_2.task_2_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public final class ImmutablePerson {

    private final String name;
    private final Integer age;
    private final List<String> hobbies;
}
