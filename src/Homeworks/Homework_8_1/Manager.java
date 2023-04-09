package Homeworks.Homework_8_1;

public class Manager {

   private String name;
   private int age;
  private   String sex;
  private   int salaryPerDay;
   private int numberOfSubordinates;

   public int getSalary(int days) {
       int salaryPerDayFromPercent = (int)((salaryPerDay / 100.0) * numberOfSubordinates);
       return (salaryPerDay + salaryPerDayFromPercent) * days;
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

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
