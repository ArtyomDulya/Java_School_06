package Lessons;

import java.util.Arrays;

public class Lesson_Irina_9 {
    public static void main(String[] args) {
        int[]arr1 = new int[] {1, 2, 3};
        int[]arr2 = {1, 2, 3};
        int[]arr3 = {1, 2, 3};


        System.out.println(Arrays.equals(arr1, arr2));

        String string = "Hello world";
        String ch = "";
        for(int i = 0; i < string.length(); i++) {
            ch += string.charAt(i);
        }
        System.out.println(ch);

    }
}
