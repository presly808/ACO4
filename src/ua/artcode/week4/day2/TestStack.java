package ua.artcode.week4.day2;

/**
 * Created by amakogon on 01.03.15.
 */
public class TestStack {

  public static void main(String[] args) {
    IStack stack = new MyStack();

    stack.push(1);
    stack.push(2);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
