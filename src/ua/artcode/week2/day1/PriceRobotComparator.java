package ua.artcode.week2.day1;

import java.util.Comparator;

/**
 * Created by serhii on 22.02.15.
 */
public class PriceRobotComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Robot r1 = (Robot) o1;
        Robot r2 = (Robot) o2;

        return Double.compare(r1.getPrice(), r2.getPrice())  ;
    }
}
