package Homeworks.Homework_10_2;

public class Homework_10_2 {

    //    Tack_1
    public static String abbrevName(String name) {
        name = name.toUpperCase();
        String[] strings = name.split(" ");
        strings[0] = strings[0].substring(0, 1);
        strings[0] += ".";
        strings[1] = strings[1].substring(0, 1);
        String result = String.join("", strings);
        return result;
    }

    //    Tack_2
    public static boolean feast(String beast, String dish) {

        char[] beasts = beast.toCharArray();
        char[] dishs = dish.toCharArray();

        if (beasts[0] != dishs[0]) {
            return false;
        } else if (beasts[beasts.length - 1] != dishs[dishs.length - 1]) {
            return false;
        }
        return true;
    }

    //    Tack_3
    public static String tripleTrouble(String one, String two, String three) {
        String[] one1 = one.split("");
        String[] two1 = two.split("");
        String[] three1 = three.split("");
        String[] result = new String[one1.length];

        for(int i = 0; i < one1.length; i++) {
            result[i] = one1[i];
        }
        for(int i = 0; i < result.length; i++) {
            result[i] += two1[i];
        }
        for(int i = 0; i < result.length; i++) {
            result[i] += three1[i];
        }
        String stringResult = String.join("", result);

        return stringResult;
    }


    //    Tack_4
    public static String position(char alphabet) {
        String string = String.valueOf(alphabet);
        string = string.toLowerCase();
        char char_ = string.charAt(0);
        char[] alphabetArr = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String index = "";
        for (int i = 0; i < alphabetArr.length; i++) {
            if (char_ == alphabetArr[i]) {
                index = String.valueOf(i);
            }
        }
        return "Position of alphabet: " + index;
    }

    //    Tack_5
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i] + arr2[i];
        }
        return sum;
    }
}
