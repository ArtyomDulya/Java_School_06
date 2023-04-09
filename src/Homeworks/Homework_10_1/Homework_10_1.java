package Homeworks.Homework_10_1;

public class Homework_10_1 {

    //    Tack_1
    public static String boolToWord(boolean b) {
        if (b) {
            return "Yes";
        } else {
            return "No";
        }

    }

    //    Tack_2
    public static Integer basicMath(String op, int v1, int v2) {
        if (op == "+") {
            return v1 + v2;
        } else if (op == "-") {
            return v1 - v2;
        } else if (op == "*") {
            return v1 * v2;
        } else if (op == "/" && v2 != 0) {
            return v1 / v2;
        } else {
            return null;
        }
    }

    //    Tack_3
    public static int[] reverse(int n) {
        int[] arr = new int[n];
        for (int i = 0, b = n; i < arr.length && b >= 0; i++, b--) {
            arr[i] += b;
        }
        return arr;
    }

    //    Tack_4
    public static String[] stringToArray(String s) {
        String[] arrayStrings = s.split(" ");
        return arrayStrings;
    }

    //    Tack_5
    public static String correct(String string) {
        return string.replace("5", "S").
                replace("0", "O").
                replace("1", "I");
    }
}
