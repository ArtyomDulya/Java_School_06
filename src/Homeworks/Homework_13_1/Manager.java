package Homeworks.Homework_13_1;

import Lessons.Lesson_13.Employee;

public class Manager extends Employee {

    private int numberOfSubordinates;

    private static final int coefficient = 3;


    public int getSalary() {
        int bonus = 0;
        if (getNumberOfSubordinates() <= 0) {
            return getBaseSalary();
        }
        bonus = (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * coefficient));
        return getBaseSalary() + bonus;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

}
