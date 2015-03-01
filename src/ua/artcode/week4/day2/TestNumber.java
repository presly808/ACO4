package ua.artcode.week4.day2;

/**
 * Created by amakogon on 01.03.15.
 */
public class TestNumber {
  public static void main(String[] args) {
    Number n1 = new Number(0);
    Number n2 = new Number(5);
    Number result = n1.add(n2);

    System.out.println(result);

    System.out.println(result.equals(n2));
    System.out.println(result.equals(n1));
  }

}
