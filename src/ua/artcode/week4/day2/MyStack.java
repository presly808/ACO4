package ua.artcode.week4.day2;

/**
 * Created by amakogon on 01.03.15.
 */
public class MyStack  implements IStack{

  private static final int DEFAULT_STACK_SIZE = 16;

  private Object[] elements;
  private int top;

  public MyStack() {
    elements = new Object[DEFAULT_STACK_SIZE];
  }

  public MyStack(int size) {
    elements = new Object[size];
  }


  public boolean push(Object obj) {
    ensureCapacity();
    boolean result = false;
    if (obj != null) {
      elements[top++] = obj;
      result = true;
    }
    return result;
  }

  public Object pop() {
    Object o = new Object();
    if (top == 0) {
      System.out.println("Stack is empty");
      return o;
    }
    o = elements[top - 1];
    elements[--top] = null;
    return o;
  }

  public void ensureCapacity(){

  }


}
