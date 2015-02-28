package ua.artcode.week4.imut;

/**
 * Created by serhii on 28.02.15.
 */
public class TestImmutable {


    public static void main(String[] args) {

        //Immutable class, objects of this class dont change own state(fields values)
        String key = "access";
        anotherUser(key);
        System.out.println(key);

    }

    private static void anotherUser(String res) {

        for (int i = 0; i < 1000; i++) {
            res = res + 1;
        }

        //System.out.println(res);
    }



}
