package Homeworks.Homework_7_1;

public class Salary {

    int getSum(Employee[] employeeArray) {
        int sum = 0;
        for(int i = 0; i < employeeArray.length; i++) {
            sum = sum + employeeArray[i].salary;
        }
        return sum;
    }
}
