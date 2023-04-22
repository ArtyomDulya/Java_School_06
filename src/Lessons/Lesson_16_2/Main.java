package Lessons.Lesson_16_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printList(List<String>list) {
        for (String str: list) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("elem 1");
        list.add("elem 2");
        list.add("elem 3");

        printList(list);



    }
}
