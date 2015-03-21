package ua.artcode.week6.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by serhii on 21.03.15.
 */
public class TestSimpleException {


    public static void main(String[] args) {

        try {
            level1();
            System.out.println("after level 1");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("after try-catch");

    }


    public static void level1() throws FileNotFoundException {
        level2();
    }

    public static void level2() throws FileNotFoundException {
        level3();
    }

    public static void level3() throws FileNotFoundException{
        InputStream is =
                new FileInputStream("/home/serhii/IdeaProjects/ACO4/temp/tex.txt");
    }

}
