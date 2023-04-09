package Homeworks;

public class HW_4 {
    public static void main(String[] args) {

//        Необходимо вывести числа от 0 до 15.

        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }

        System.out.println();

//        Необходимо вывести все положительные степени числа 5 которые меньше 10000,
//        вывести результат возведения в степень.
        int result = 1;
        for (int i = 1; i <= 6; i++) {
            result = result * 5;
            if (result < 10000) {
                System.out.println(result);
            }
        }
        System.out.println();

//        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//        Реализовать 2 варианта:
//        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//        без использования конструкции if (шаг цикла на ваше усмотрение).

        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        for (int i = 40; i <= 60; i += 4) {
            System.out.println(i);
        }
    }
}
