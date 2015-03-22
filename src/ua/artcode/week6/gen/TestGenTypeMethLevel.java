package ua.artcode.week6.gen;

/**
 * Created by serhii on 22.03.15.
 */
public class TestGenTypeMethLevel {

    public static void main(String[] args) {
        String max = GenTypeMethodLevel.<String>max("Vova","Oleg");
        System.out.println(max);

    }

}
