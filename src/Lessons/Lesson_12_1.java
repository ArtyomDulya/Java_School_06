package Lessons;

import java.util.Scanner;


public class Lesson_12_1 {

    public static double calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        double number2 = scanner.nextInt();
        System.out.print("Какую операцию вы хотите совершить");
        String operation = scanner.next();
        if(operation == "+") {
            return number1 + number2;
        }
        if(operation == "-") {
            return  number1 - number2;
        }
        if(operation == "*") {
            return  number1 * number2;
        }
        if(operation == "/") {
            if(number2 == 0) {
                return 0;
            }
            return  number1 - number2;
        }
        return 0;
    }

    public static void leapYearSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("Januar, 31 days");
                break;
            case 2:
                System.out.println("February");
                if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    System.out.println("29 days leap  year");
                } else {
                    System.out.println("28 days not leap year");
                }
                break;
            case 3:
                System.out.println("March, 31 days");
                break;
            case 4:
                System.out.println("April, 30 days");
                break;
            case 5:
                System.out.println("May, 31 days");
                break;
            case 6:
                System.out.println("June, 30 days");
                break;
            case 7:
                System.out.println("Jule, 31 days");
                break;
            case 8:
                System.out.println("August, 31 days");
                break;
            case 9:
                System.out.println("September, 30 days");
                break;
            case 10:
                System.out.println("Oktober, 31 days");
                break;
            case 11:
                System.out.println("November, 30 days");
                break;
            case 12:
                System.out.println("December, 31 days");
                break;
            default:
                System.out.println("repeat");

        }
    }

    public static void main(String[] args) {

        leapYearSearch();




    }
}
