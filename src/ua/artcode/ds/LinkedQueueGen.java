package ua.artcode.ds;

import ua.artcode.ds.dynamic.Node;

import java.util.Iterator;

public class LinkedQueueGen<E> implements IQueue<E> {

    private Node<E> tail;
    private Node<E> head;
    private int size;

    public LinkedQueueGen() {
    }

    @Override
    public E dequeue() {
        if(head == null) return null;
        E ret = head.getVal();
        head = head.getNext();
        return ret;
    }

    @Override
    public void enqueue(E o) {
        Node<E> temp = new Node<E>(o, null);
        if(tail == null){ //empty
            head = temp;
            tail = temp;
        } else { // when non empty
            tail.setNext(temp);
            tail = temp;
        }
    }


    @Override
    public Iterator<E> iterator() {
        return new LinkedQueueIterator();
    }

    private class LinkedQueueIterator implements Iterator<E> {

        private Node<E> curr = head;

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public E next() {
            E ret = curr.getVal();
            curr = curr.getNext();
            return ret;
        }

        @Override
        public void remove() {

        }
    }
}
