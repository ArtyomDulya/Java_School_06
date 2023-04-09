package Homeworks.Homework_8_2;

public class Manager extends Worker{
   private int numberOfSubordinates;
@Override
   public double getSalary() {
       Employee employee = new Employee();
        if(numberOfSubordinates > 0) {
            return getBaseSalary() / 100.0 * numberOfSubordinates;
        } else {
            return employee.getBaseSalary();
        }
   }



    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
