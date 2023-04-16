package Lessons.Lesson_15_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Number> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(1.1);

        List<Number> lst2 = new LinkedList<>();
        lst2.add(1);
        lst2.add(2);
        lst2.add(1.1);

        lst.addAll(lst2);

        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
        MyList<Integer> list = new MyList();

        for (int i = 0; i < 9; i++) {
            list.add(i);
        }

        MyList<Integer> lst1 = new MyList<>();



    }
}
