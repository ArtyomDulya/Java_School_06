package Lessons.Lesson_14_1;

import java.util.Iterator;
import java.util.Random;

public class SecretCollection {
    private Random r = new Random();
    private int[] elements = {r.nextInt(100), r.nextInt(100), r.nextInt(100)};

    public Iterator iterator() {
        return new Iterator();
    }

    private int encode(int element) {
        return 100 - element;
    }

    public class Iterator implements java.util.Iterator<Integer> {
        private int currentIndex = -1;

        @Override
        public boolean hasNext() {
            return currentIndex < elements.length - 1;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                currentIndex += 1;
                return encode(elements[currentIndex]);
            } else {
                return null;
            }
        }
    }
}
