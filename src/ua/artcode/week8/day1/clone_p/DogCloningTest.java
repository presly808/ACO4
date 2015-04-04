package ua.artcode.week8.day1.clone_p;

import java.util.Date;

/**
 * Created by serhii on 04.04.15.
 */
public class DogCloningTest {

    public static void main(String[] args) {
        Dog dog = new Dog(3,new Date(), "Sharic");
        //Dog dog1 = new Dog(dog.getAge(), dog.getBirthday(),dog.getName());
        Dog cloned =  dog.clone();
        System.out.println(cloned);
    }
}
