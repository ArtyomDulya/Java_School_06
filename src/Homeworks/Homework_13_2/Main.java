package Homeworks.Homework_13_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee greg = new Employee();
        greg.setDeySalary(50);

        MonthUtils.Month[] arr1 = MonthUtils.getQuarter(1);

        Manager simon = new Manager();
        simon.setDeySalary(50);
        simon.setNumberOfSubordinates(10);
        System.out.println(greg.getSalary(arr1));
        System.out.println(simon.getSalary(arr1));

    }
}
