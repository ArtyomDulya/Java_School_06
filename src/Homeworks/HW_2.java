package Homeworks;

public class HW_2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println("a + b = " + (a + b) + "; a - b = " + (a - b) + "; a * b = " + (a * b) +
                "; a / b = " + (a / b) + ";");

        System.out.println("a % b = " + (a % b));

        if( a % 2 == 0) {
            System.out.println("true");
        } else {}
        System.out.println("false");
        if(b % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        String myString = "U+1F92D";
        System.out.print(Character.toChars(Integer.parseInt(myString.substring(2), 16)));







    }
}
