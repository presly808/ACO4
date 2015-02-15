package ua.artcode.week2.day1;

/**
 * Created by serhii on 14.02.15.
 */
public class MyDate {

    private int year;
    private int month;
    private int day;

    private MyTime time;//null

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(int year, int month, int day, MyTime time) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.time = time;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyTime getTime() {
        return time;
    }

    public void setTime(MyTime time) {
        this.time = time;
    }

    public String format(){
        return String.
                format("Date={year : %d, month : %d, day : %d, time : %s}",
                        year, month, day,
                        /*time != null ? */time.format());
    }
}
