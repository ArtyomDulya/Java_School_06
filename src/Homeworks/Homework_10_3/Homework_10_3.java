package Homeworks.Homework_10_3;

public class Homework_10_3 {

    //    Tack_1
    public static String MakeUpperCase(String str) {
        return str = str.toUpperCase();
    }

    //    Tack_2
    public static String remove(String str) {
        return str = str.substring(1, str.length() - 1);
    }

    //    Tack_3
    public static String noSpace(final String x) {
        return x.replaceAll("\\s+", "");
    }

    //    Tack_4
    public static String updateLight(String current) {
        current = current.toLowerCase();
        current = current.toLowerCase();
        if (current == "red") {
            current = "green";
        } else if (current == "green") {
            current = "yellow";
        } else if (current == "yellow") {
            current = "red";
        }
        return current;
    }

    //    Tack_5
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
