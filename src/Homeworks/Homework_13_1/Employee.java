package Homeworks.Homework_13_1;

abstract public class Employee {

   private int baseSalary;
   private String name;

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public abstract int getSalary();
}
