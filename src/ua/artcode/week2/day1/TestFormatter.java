package ua.artcode.week2.day1;

/**
 * Created by serhii on 14.02.15.
 */
public class TestFormatter {


    public static void main(String[] args) {
        int i = 7865;
        double d = 874.2344545;
        String word = "new sequence";
        char c = 'm';

        boolean b = true;

        String formatted =String.format("%d, %.3f, %s, %c, %1$X", i, d, word, c);
        System.out.println(formatted);
        System.out.printf("%d, %.3f, %s, %c, %1$X", i, d, word, c);

    }



}
