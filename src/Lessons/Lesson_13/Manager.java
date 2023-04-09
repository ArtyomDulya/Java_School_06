package Lessons.Lesson_13;

public class Manager extends Worker {
   private int numberOfSubordinates;
@Override
   public double getSalary() {

        if(numberOfSubordinates > 0) {
            return getBaseSalary() / 100.0 * numberOfSubordinates;
        } else {
            return getBaseSalary();
        }
   }



    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
