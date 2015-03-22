package ua.artcode.ds.test;

import ua.artcode.ds.IQueue;
import ua.artcode.ds.LinkedQueueGen;

import java.util.Iterator;

/**
 * Created by serhii on 22.03.15.
 */
public class TestQueueGen {


    public static void main(String[] args) {
        IQueue<String> queue = new LinkedQueueGen<String>();
        queue.enqueue("let");
        queue.enqueue("it");
        queue.enqueue("go");

        Iterator<String> iter = queue.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
