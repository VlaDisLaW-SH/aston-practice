package lesson_5.task_5_2;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        // 1
        List<Employee> employees = Employee.createListEmployees();

        // 2
        Employee.toFindEmployeesOverThirtyYearsOld(employees)
            .forEach(employee -> System.out.println(employee.getName() + " - " + employee.getAge() + " years old"));
        System.out.println();

        // 3
        System.out.println("Total number of employees in IT " + Employee.toCountTotalNumberOfEmployeesInIT(employees) + " persons");
        System.out.println();

        // 4
        var maxEmployee = Employee.toFindEmployeeWithMaxSalary(employees);
        if (maxEmployee != null) {
            System.out.println("The employee with maximum salary - " + maxEmployee.getName());
        } else {
            System.out.println("The employee with maximum salary not found");
        }
        System.out.println();

        // 5
        Employee.getListNamesOfEmployeesInHR(employees)
            .forEach(System.out::println);
        System.out.println();

        // 6
        System.out.println("Average employees salary - " + Employee.getAverageEmployeesSalary(employees) + " of rubles");
    }
}
