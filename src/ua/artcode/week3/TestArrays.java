package ua.artcode.week3;

import ua.artcode.week2.day1.PriceRobotComparator;
import ua.artcode.week2.day1.Robot;

import java.util.Arrays;

/**
 * Created by serhii on 22.02.15.
 */
public class TestArrays {

    public static void main(String[] args) {
        Robot[] robots = new Robot[5];
        robots[0] = new Robot(678, 8998, "AN-98", null, null);
        robots[1] = new Robot(67, 5678, "Luck", null, null);
        robots[2] = new Robot(10, 8001, "YAMAmoto", null, null);
        robots[3] = new Robot(97, 100, "LKm", null, null);
        robots[4] = new Robot(98, 103, "Zqw", null, null);


        Arrays.sort(robots, new PriceRobotComparator());
        System.out.println(Arrays.toString(robots));
        System.out.println("**************************");


        Arrays.sort(robots);
        System.out.println(Arrays.toString(robots));
    }

}
