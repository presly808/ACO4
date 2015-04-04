package ua.artcode.week8.day1.date_format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by serhii on 04.04.15.
 */
public class TestDateFormatter {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        String pattern = "yyyy/MM/dd";
        System.out.println("input date using pattern " + pattern);

        String strDate = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

        Date date = dateFormat.parse(strDate);

        System.out.println("Parsed " + dateFormat.format(new Date()));
    }


}
