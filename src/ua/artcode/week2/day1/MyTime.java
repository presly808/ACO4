package ua.artcode.week2.day1;

/**
 * Created by serhii on 14.02.15.
 */
public class MyTime {

    private int hours;
    private int minutes;
    private int seconds;

    public MyTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String format(){
        return String.format("Time={hours : %d, minutes : %d, seconds : %s}",
                        hours,minutes,seconds);
    }
}
