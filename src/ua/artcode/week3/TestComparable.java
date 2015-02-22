package ua.artcode.week3;

import ua.artcode.sort.SelectionSorterUniversal;
import ua.artcode.week2.day1.Robot;

import java.util.Arrays;

/**
 * Created by serhii on 22.02.15.
 */
public class TestComparable {


    public static void main(String[] args) {
        Robot[] robots = new Robot[5];

        robots[0] = new Robot(678, 1000, "AN-98", null, null);
        robots[1] = new Robot(67, 1000, "Luck", null, null);
        robots[2] = new Robot(10, 1000, "YAMAmoto", null, null);
        robots[3] = new Robot(97, 1000, "LKm", null, null);
        robots[4] = new Robot(98, 1000, "Zqw", null, null);

        SelectionSorterUniversal.sort(robots);


        String res = Arrays.toString(robots);
        System.out.println(res);

    }
}
