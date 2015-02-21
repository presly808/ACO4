package ua.artcode.home;

import ua.artcode.week2.day1.Robot;

/**
 * Created by serhii on 21.02.15.
 */
public class TestMyArray {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(10);

        myArray.add("Kolia");
        myArray.add(87);
        myArray.add(78.8);
        Robot robot = new Robot(100, 1515, "robot", null, null);
        myArray.add(robot);

        myArray.showAll();

        System.out.println(robot);
    }

}
