package ua.artcode.ds;

/**
 * Created by serhii on 28.02.15.
 */
public class MyStack implements IStack {

    private Object[] mas;
    private int top;

    public MyStack() {
        mas = new Object[10];
    }

    public MyStack(int size){
        mas = new Object[size];
    }

    @Override
    public void push(Object obj) {
        if(top >= mas.length){
            System.err.println("Stack is full");
        } else {
            mas[top] = obj;
            top++;
        }
    }

    @Override
    public Object pop() {
        if(top - 1 < 0){
            System.err.println("Stack is empty");
            return null;
        } else {
            top--;
            return mas[top];
        }
    }

    @Override
    public String toString() {
        String res = "";
        for(int i = top - 1; i >= 0; i--){
           res += String.format("|%20s|\n", mas[i].toString());
        }

        return res;
    }
}
