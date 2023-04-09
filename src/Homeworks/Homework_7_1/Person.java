package Homeworks.Homework_7_1;

public class Person {

    String name;
    int age;
    String sex;

    String getName() {
        if(sex.equals("M")) {
            return name += "Mr. " + name;
        } else {
            return name += "Mrs. " + name;
        }
    }
}
