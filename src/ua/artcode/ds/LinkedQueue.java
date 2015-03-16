package ua.artcode.ds;

import ua.artcode.ds.dynamic.Node;

import java.util.Iterator;

public class LinkedQueue implements IQueue, Iterable {

    private Node tail;
    private Node head;
    private int size;

    public LinkedQueue() {
    }

    @Override
    public Object dequeue() {
        if(head == null) return null;
        Object ret = head.getVal();
        head = head.getNext();
        return ret;
    }

    @Override
    public void enqueue(Object o) {
        Node temp = new Node(o, null);
        if(tail == null){ //empty
            head = temp;
            tail = temp;
        } else { // when non empty
            tail.setNext(temp);
            tail = temp;
        }
    }


    @Override
    public Iterator iterator() {
        return new LinkedQueueIterator();
    }

    private class LinkedQueueIterator implements Iterator {

        private Node curr = head;

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public Object next() {
            Object ret = curr.getVal();
            curr = curr.getNext();
            return ret;
        }

        @Override
        public void remove() {

        }
    }
}
