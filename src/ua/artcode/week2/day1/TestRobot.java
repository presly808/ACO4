package ua.artcode.week2.day1;

/**
 * Created by serhii on 14.02.15.
 */
public class TestRobot {

    public static void main(String[] args) {

        MyTime time = new MyTime(15,33,56);
        MyDate date = new MyDate(2015,02,15);

        MyAddress address = new MyAddress("Kiev", "Vandy",5);

        Robot robot = new Robot(100, 10000, "R2D2", date,address);
        System.out.println(robot.format());

    }

}
