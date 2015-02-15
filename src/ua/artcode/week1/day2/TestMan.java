package ua.artcode.week1.day2;

import ua.artcode.week2.day1.Robot;

/**
 * Created by serhii on 08.02.15.
 */
public class TestMan {

    public static void main(String[] args) {
        Man man1 = new Man(); // create ref = create instance(object)
        man1.age = -7;
        man1.name = "Vova";
        man1.sayHello();

        Man man2 = new Man();
        man2.age = 22;
        man2.name = "Oleg";
        man2 = man1;

        man2.sayHello();




    }

}
