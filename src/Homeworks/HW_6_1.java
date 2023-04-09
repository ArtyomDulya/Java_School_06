package Homeworks;

public class HW_6_1 {

    static int tackNumber = 1;

    public static void tack() {
        System.out.println("Tack " + tackNumber++);
    }

    public static void line() {
        System.out.println("===============================================================");
    }

    public static void main(String[] args) {

//        1.Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.
        tack();
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        line();

//        2.Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        tack();
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++) {
            if (maxValue < array2[i]) {
                maxValue = array2[i];
            }
        }
        System.out.println(maxValue);
        line();

//        3.Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.
        tack();
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array3.length; i++) {
            if (minValue > array3[i]) {
                minValue = array3[i];
            }
        }
        System.out.println(minValue);
        line();

//        4.Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

        tack();
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sum = 0;
        int count = 0;
        for (int i = 0; i < array4.length; i++) {
            sum += array4[i];
            count++;
        }
        System.out.println(sum / count);
        line();

//        5.Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.
        tack();
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        sum = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                sum += array5[i][j];
            }
        }
        System.out.println(sum);
        line();

//        6.Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.
        tack();
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (minValue > array6[i][j]) {
                    minValue = array6[i][j];
                }
            }
        }
        System.out.println(minValue);
        line();

//        7.Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.
        tack();
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        count = 0;
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                count++;
            }
        }
        System.out.println(count);
        line();
    }
}
