package ua.artcode.ds.test;

import ua.artcode.ds.IStack;
import ua.artcode.ds.MyStack;

/**
 * Created by serhii on 28.02.15.
 */
public class TestMyStack {

    public static void main(String[] args) {
        IStack stack = new MyStack(20);

        stack.push("Andrey");
        stack.push("Anton");
        stack.push("Oleg");
        stack.push("ValeriIvanovich");

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack);


    }

}
