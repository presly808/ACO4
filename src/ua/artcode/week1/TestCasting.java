package ua.artcode.week1;

/**
 * Created by serhii on 08.02.15.
 */
public class TestCasting {

    public static void main(String[] args) {
        short s = 130;
        byte b = (byte) s;
        for (int i = -1; i > -30; i--) {
            String s1 = Integer.toBinaryString(i);
            System.out.println(i + " -> " + s1.substring(s1.length() - 8, s1.length()));
        }
        System.out.println(b);

    }

}
