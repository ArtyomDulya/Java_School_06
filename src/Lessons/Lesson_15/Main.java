package Lessons.Lesson_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("One");
        arrayList.add("C");

        for (String str : arrayList) {
            System.out.println(str);
        }

        System.out.println(arrayList.get(1));

        arrayList.remove(1);

        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("A"));

        List<Integer> assI = new LinkedList<>();

        assI.add(1);
        assI.add(2);
        assI.add(234);

        System.out.println(assI);

        GenericExample<String> str = new GenericExample<>("test value");
        System.out.println(str.getField());

        GenericExample<Integer> numbers = new GenericExample<>(123);
        System.out.println(numbers.getField());

        System.out.println(arrayList.stream().sorted().collect(Collectors.toList()));


    }
}
