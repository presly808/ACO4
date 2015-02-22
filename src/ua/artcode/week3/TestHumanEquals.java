package ua.artcode.week3;

import java.util.Date;

/**
 * Created by serhii on 22.02.15.
 */
public class TestHumanEquals {

    public static void main(String[] args) {
        Date birthday = new Date();
        Human human1 = new Human(null, 25, 80, birthday);
        Human human2 = new Human("Anton", 25, 80, birthday);

        System.out.println("human1 == human2 " + (human1 == human2));
        System.out.println("human1.equals(human2) " + human1.equals(human2));
    }


}
