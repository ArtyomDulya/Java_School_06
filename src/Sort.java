import java.util.Arrays;

public class Sort {

    public static int[] bubbleSort1(int[] array) {

        int box = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    box = array[j];
                    array[j] = array[i];
                    array[i] = box;
                }
            }
        }
        return array;
    }

    public static int[] bubbleSort2(int[] array) {

        int box = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    box = array[j];
                    array[j] = array[i];
                    array[i] = box;
                }
            }
        }

        return array;
    }

    public static int[] bubbleSort(int[] array) {

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if ( array[i - 1] > array[i]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 48, 74, 55, 36};
//        bubbleSortReset1(array);
//        bubbleSort2(array);
//        bubbleSort(array);

        long start = 0;
        long end = 0;

        start = System.nanoTime();
        System.out.println("hello");
        end = System.nanoTime();
        System.out.println(end - start);
    }
}
