package ua.artcode.week4;

/**
 * Created by serhii on 28.02.15.
 */
public class TestStatic {

    public static void main(String[] args) {
        HumanWithStatic h1 = new HumanWithStatic(23);
        HumanWithStatic h2 = new HumanWithStatic("Kolia");
        HumanWithStatic h3 = new HumanWithStatic(23, "Oleg");
        System.out.println(HumanWithStatic.getCount());
    }

}
