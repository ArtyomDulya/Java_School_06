package Homeworks.Homework_13_1;

public final class Director extends Employee {

    private int NumberOfSubordinates;
    private static final int coefficient = 9;

    @Override
    public int getSalary() {
        int bonus = 0;
        if (getNumberOfSubordinates() <= 0) {
            return getBaseSalary();
        }
        bonus = (int)(getBaseSalary() * (getNumberOfSubordinates() / 100.0 * coefficient));
        return  getBaseSalary() + bonus;
    }

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }


}
