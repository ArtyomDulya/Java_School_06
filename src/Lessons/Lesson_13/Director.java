package Lessons.Lesson_13;

public class Director extends Manager {
@Override
    public double getSalary() {

        if(getNumberOfSubordinates() > 0) {
            return getBaseSalary() * (getNumberOfSubordinates() / 100.0) * 9;
        } else {
            return getBaseSalary();
        }
    }
}
