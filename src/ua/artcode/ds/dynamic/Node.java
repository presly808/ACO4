package ua.artcode.ds.dynamic;

/**
 * Created by serhii on 14.03.15.
 */
public class Node<E> {

    private E val;
    private Node<E> next;

    public Node() {
    }

    public Node(E val) {
        this.val = val;
    }

    public Node(E val, Node<E> next) {
        this.val = val;
        this.next = next;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
