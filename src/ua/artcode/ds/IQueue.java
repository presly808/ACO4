package ua.artcode.ds;


import java.util.Iterator;

public interface IQueue<T> extends Iterable<T> {

    T dequeue();

    void enqueue(T o);


}
