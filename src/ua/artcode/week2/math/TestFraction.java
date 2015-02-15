package ua.artcode.week2.math;

/**
 * Created by serhii on 15.02.15.
 */
public class TestFraction {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(4,20);

        Fraction r1 = f1.add(f2);
        System.out.println(r1.format());
        r1.simplify();
        System.out.println(r1.format());

        Fraction f3 = new Fraction(5,78);



    }


}
