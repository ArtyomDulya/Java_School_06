package Homeworks.Homework_13_1;



public class Main {

    public static void main(String[] args) {
        Manager john = new Manager();
        john.setName("John");
        john.setBaseSalary(50);
        john.setNumberOfSubordinates(10);
        System.out.println(john.getSalary());
    }
}
