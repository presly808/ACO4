package ua.artcode.ds.test;


import ua.artcode.ds.LinkedQueue;

import java.util.Iterator;

/**
 * Created by serhii on 15.03.15.
 */
public class TestQueueIter {

    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        linkedQueue.enqueue(4);
        linkedQueue.enqueue(5);


        /*Iterator iterator = linkedQueue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/


        //use iterator inside
        for(Object o : linkedQueue){
            System.out.println(o);
        }





    }

}
