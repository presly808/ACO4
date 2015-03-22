package ua.artcode.week6.gen;

/**
 * Created by serhii on 22.03.15.
 */
public class GenTypeMethodLevel {



    public static <T extends Comparable> T max(T a1, T a2){
        return a1.compareTo(a2) > 0 ? a1 : a2;
    }

}
