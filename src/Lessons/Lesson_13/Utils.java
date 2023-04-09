package Lessons.Lesson_13;

public class Utils {
    public static int findByName(String name, Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public static int findByStringName(String substring, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(substring)) {
                return i;
            }
        }
        return -1;
    }

    public static int sumSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getBaseSalary();
        }
        return sum;
    }

    public static int minSalary(Employee[]employees) {
        int minSalary = Integer.MAX_VALUE;
        for(int i = 0; i < employees.length; i++) {
            if(minSalary > employees[i].getBaseSalary()) {
                minSalary = employees[i].getBaseSalary();
            }
        }
        return minSalary;
    }

    public static int maxSalary(Employee[]employees) {
        int maxSalary = Integer.MIN_VALUE;
        for(int i = 0; i < employees.length; i++) {
            if(maxSalary < employees[i].getBaseSalary()) {
                maxSalary = employees[i].getBaseSalary();
            }
        }
        return maxSalary;
    }

    public static int minManager(Manager[]managers) {

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < managers.length; i++) {
            if(min > managers[i].getNumberOfSubordinates()) {
                min = managers[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    public static int maxManager(Manager[]managers) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < managers.length; i++) {
            if(max < managers[i].getNumberOfSubordinates()) {
               max = managers[i].getNumberOfSubordinates();
            }
        }
        return max;
    }

    public static double maxManagerBonus(Manager[]managers) {
        double max = Integer.MIN_VALUE;
        for(int i = 0; i < managers.length; i++) {
            if(max < managers[i].getSalary()) {
                max = managers[i].getSalary();
            }
        }
        return max;
    }

    public static double minManagerBonus(Manager[]managers) {
        double min = Integer.MAX_VALUE;
        for(int i = 0; i < managers.length; i++) {
            if(min > managers[i].getSalary()) {
                min = managers[i].getSalary();
            }
        }
        return min;
    }


}
