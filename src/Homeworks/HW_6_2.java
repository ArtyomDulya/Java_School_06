package Homeworks;

public class HW_6_2 {

    static int numberTack = 1;

    static void tack() {
        System.out.println("Tack " + numberTack++);
    }

    static void line() {
        System.out.println("========================================================");
    }

    public static void main(String[] args) {

//        1.Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//        Для указанной строки ответ будет “ооооо” (или в столбик)

        tack();
        String s = "Перестановочный алгоритм быстрого действия";
        String result = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'о') {
                result += s.charAt(i);
            }
        }
        System.out.println(result);

//        2.Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.

        tack();
         s = "Перевыборы выбранного президента";
         int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);
        line();

//        3.Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.

        tack();
        s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();

        int index = s.indexOf("рит");

        while (index != -1) {
            System.out.println(index);
            index = s.indexOf("рит", index + 1);
        }
        line();

//        4.Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        tack();
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
          count = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                if(array[i][j].indexOf('е') == -1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        line();
    }
}
