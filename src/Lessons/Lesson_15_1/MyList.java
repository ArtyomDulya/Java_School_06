package Lessons.Lesson_15_1;

public class MyList<T> {

    T[] arr = (T[]) new Object[10];
    int index = 0;

    void add(T a) {
        if (index < 10) {
            arr[index] = a;
        }
    }

    T get(int index) {
        return arr[index];
    }

    static void print(MyList<?>list){
        System.out.println(list.get(0));
    }

}
