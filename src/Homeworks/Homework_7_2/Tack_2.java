package Homeworks.Homework_7_2;

public class Tack_2 {

    int width;
    int length;
    int height;

    public Tack_2(int[] arr) {
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    int getVolume() {
        return width * length * height;
    }

    int getSurfaceArea() {
        return 2 * (width * length + length * height + height * width);
    }
}
