package Homeworks.Homework_13_2;

public final class Manager {

    private String name;
    private int age;
    private String sex;
    private int deySalary;
    private int numberOfSubordinates;




    public int getSalary(MonthUtils.Month[] monthArray) {
        int sumSalary = 0;
        int bonus = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sumSalary += monthArray[i].getWorkDay() * deySalary;
        }
        bonus = (int) (sumSalary * numberOfSubordinates / 100.0);

        return sumSalary + bonus;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDeySalary() {
        return deySalary;
    }

    public void setDeySalary(int deySalary) {
        this.deySalary = deySalary;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
