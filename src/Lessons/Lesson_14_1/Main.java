package Lessons.Lesson_14_1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        SecretCollection secret1 = new SecretCollection();
        for (Iterator<Integer> i = secret1.new Iterator(); i.hasNext();  ) {
            System.out.println(i.next());
        }
    }
}
