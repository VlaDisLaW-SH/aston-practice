package lesson_5.task_5_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Employee {

    private String name;
    private Integer age;
    private String department;
    private Integer salary;

    public static List<Employee> createListEmployees() {

        return List.of(
            new Employee("Ivan", 29, "IT", 150000),
            new Employee("Victoria", 31, "HR", 80000),
            new Employee("Peter", 27, "IT", 75000),
            new Employee("Oleg", 35, "Management", 160000),
            new Employee("Mary", 23, "HR", 40000),
            new Employee("Paul", 33, "IT", 175000),
            new Employee("Pauline", 24, "IT", 50000),
            new Employee("Roman", 26, "HR", 55000)
        );
    }

    public static List<Employee> toFindEmployeesOverThirtyYearsOld(List<Employee> employees) {

        return employees.stream()
            .filter(employee -> employee.getAge() > 30)
            .sorted(Comparator.comparing(Employee::getAge))
            .toList();
    }

    public static Long toCountTotalNumberOfEmployeesInIT(List<Employee> employees) {

        return employees.stream()
            .filter(employee -> employee.getDepartment().equals("IT"))
            .count();
    }

    public static Employee toFindEmployeeWithMaxSalary(List<Employee> employees) {

        return employees.stream()
            .max(Comparator.comparing(Employee::getSalary))
            .orElse(null);
    }

    public static List<String> getListNamesOfEmployeesInHR(List<Employee> employees) {

        return employees.stream()
            .filter(employee -> employee.getDepartment().equals("HR"))
            .map(Employee::getName)
            .sorted()
            .toList();
    }

    public static Integer getAverageEmployeesSalary(List<Employee> employees) {

        var totalSalary = employees.stream()
            .map(Employee::getSalary)
            .reduce(0, (subtotal, employee) -> subtotal + employee);

        return totalSalary / employees.size();
    }
}
