import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;

public class Codewars {

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * n[i];
            sum += n[i];
        }
        return sum;
    }

    public static double sum(double[] numbers) {
        double sum = 0;
        if (numbers == null) {
            return 0;
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static String stringy(int size) {
        String number = Integer.toString(size);
        String[] numbers = number.split("");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = "0";
        }
        for (int i = 0; i < numbers.length; i += 2) {
            numbers[i] = "1";
        }
        String number2 = String.join("", numbers);

        return number2;
    }

    public static String tripleTrouble(String one, String two, String three) {
        String[] one1 = one.split("");
        String[] two1 = two.split("");
        String[] three1 = three.split("");
        String[] result = new String[one1.length];

        for (int i = 0; i < one1.length; i++) {
            result[i] = one1[i];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] += two1[i];
        }
        for (int i = 0; i < result.length; i++) {
            result[i] += three1[i];
        }
        String stringResult = String.join("", result);

        return stringResult;
    }

    public static boolean findPallindrome(String str) {

        str = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "").
                replaceAll("\\d", "");

        String[] strArr = str.split("");
        String result = "";
        String backResult = "";

        for (int i = 0; i < strArr.length; i++) {
            result += strArr[i];
        }
        for (int i = strArr.length - 1; i >= 0; i--) {
            backResult += strArr[i];
        }

        return result.equals(backResult);
    }

    public static long getFibonacci(int index) {
        if (index == 0) {
            return 0;
        }
        if (index < 0 || index > 92) {
            throw new IndexOutOfBoundsException(index);
        }
        long n0 = 0L;
        long n1 = 1L;

        for (int i = 2; i <= index; i++) {
            long n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n1;
    }

    static String encode(String word) {
        word = word.toLowerCase();
        String[] strArr = word.split("");
        String brackets = "";
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    count++;
                }
            }
            if (count > 1) {
                brackets += ")";
            } else {
                brackets += "(";
            }
            count = 0;
        }
        return brackets;
    }

    public static long sumMul(int m, int n) {
        int sum = 0;
        if (n <= 0 || m <= 0) throw new IllegalArgumentException("Value N pr M is incorrect!!!");

        for (int i = 1; n * i < m; i++) {
            sum += n * i;
        }
        return sum;
    }


    public static int[] flattenAndSort(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        int[] arr2 = new int[count];
        int countR = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arr2[countR] = array[i][j];
                countR++;
            }
        }

        Arrays.sort(arr2);

        return arr2;

    }

//    public static int flattenAndSort(int[][] array) {
//        int count = 0;
//        ArrayList <Integer> strList = new ArrayList<Integer>();
//        String line = "";
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length; j++) {
//                    line += array[i][j] + " ";
//                }
//            }
//
//            String[]arr =  line.split(" ");
//
//
//        return number;
//    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        double[] arr1 = {1.1, 2.2, 3.3};
//        System.out.println(squareSum(arr));
//        System.out.println(sum(arr1));
//        System.out.println(stringy(50));
//        System.out.println(tripleTrouble("huy", "hay", "hoi"));
//        System.out.println(findPallindrome("Anny___9789087"));
//        System.out.println(getFibonacci(2));
//        System.out.println(encode("ssass"));

        int[] fffrr = flattenAndSort(new int[][]{{3, 5, 8}, {6, 9, 2}});
        System.out.println(Arrays.toString(fffrr));
    }
}
