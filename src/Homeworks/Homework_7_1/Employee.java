package Homeworks.Homework_7_1;

public class Employee {

    String name;
    int age;
    String sex;
    int salary;

    boolean isSameName(Employee employee) {
        return name.equals(employee.name);

    }
}
