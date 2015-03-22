package ua.artcode.week6.decor;

import ua.artcode.service_centre.*;

/**
 * Created by serhii on 22.03.15.
 */
public class TestDecor {


    public static void main(String[] args) {
        Director director = new Director(
                                new Manager(
                                    new Manager(null)
                                )
                            );

        String res = director.work();

        System.out.println(res);
    }
}
