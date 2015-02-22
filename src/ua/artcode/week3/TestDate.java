package ua.artcode.week3;

import java.util.Date;

/**
 * Created by serhii on 22.02.15.
 */
public class TestDate {


    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //Formatter
        System.out.printf("%1$ty/%1$tm/%1$td %1$tH:%1$tM\n", date);
        System.out.println(date.getTime());


        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            Math.asin(0.765);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}
