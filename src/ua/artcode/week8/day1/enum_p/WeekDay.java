package ua.artcode.week8.day1.enum_p;

/**
 * Created by serhii on 04.04.15.
 */
public class WeekDay {

    private int num;
    private String name;

    public WeekDay() {
    }

    public WeekDay(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
