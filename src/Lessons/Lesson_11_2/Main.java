package Lessons.Lesson_11_2;

public class Main {

    private String name;

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getName());
        Uravnenie uravnenie = new Uravnenie.Builder().
                setparam1(1).
                setparam2(2).
                setparam3(3).
                setparam4(4).
                build();
        System.out.println(uravnenie);
    }

    void cals() {
        Pair pair = new Pair();
    }

    public class Pair{
        int first;
        double second;
    }
}

