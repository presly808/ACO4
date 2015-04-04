package ua.artcode.week8.day1.enum_p;

/**
 * Created by serhii on 04.04.15.
 */
public class TestWeekDay {

    public static void main(String[] args) {
        //WeekDay day1 = new WeekDay(1,"Monday");
        WeekDayE day2 = WeekDayE.TUESDAY;

        //WeekDayE test = new WeekDayE();
        //System.out.println(day2.toString());
        System.out.println(day2.name());
        System.out.println(day2.ordinal());

        WeekDayE day1 = WeekDayE.valueOf("MONDAY");
        WeekDayE[] week = WeekDayE.values();

        for(WeekDayE d : week){
            System.out.printf("name %s, order %d;", d.name(), d.ordinal());
        }

    }

}
