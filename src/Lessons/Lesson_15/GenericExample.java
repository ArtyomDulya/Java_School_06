package Lessons.Lesson_15;

public class GenericExample <T>{

    private T field;

    public GenericExample(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
