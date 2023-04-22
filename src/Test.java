import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static  void ss (int[]arr) {

        int sum = 0;
        ArrayList <Integer> array  = new ArrayList<>();

        for (int i = 0; i <= arr.length; i++) {

        }

    }

    public static void main(String[] args) {

        String[] expectedResult = {"Welcome to 99 Bottles of Beer", "Category A", "Search Languages",
                "Top Rated", "Sign Guestbook", "Submit New Language"};
        String[] expectedResult2 = {"Welcome to 99 Bottles of Beer", "Category A", "Search Languages",
                "Top Rated", "Sign Guestbook", "Submit New Language"};
        String[]ex = new String[expectedResult.length];

        List<String> list = new ArrayList<>();

        for (int i = 0; i < expectedResult.length; i++) {
            list.add(expectedResult[i]);
            list.add((expectedResult2[i]));
        }
        System.out.println(list);

    }
}
