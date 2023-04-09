package Homeworks;

public class HW_5 {

    public static void main(String[] args) {

//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 9; i >= 0; i--) {
            for(int j = 0; j < 9 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 9; i >= 0; i--) {
            for(int j = 9 - i; j >= 0; j--) {
                System.out.print("  ");
            }
            for(int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }





    }
}
