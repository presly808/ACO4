package ua.artcode.ds.dynamic;

import java.util.Arrays;

/**
 * Created by serhii on 14.03.15.
 */
public class NodeUtils {

    public static void addToTail(Node first,Object val){
        // find last
        Node iter = first;
        while (iter.getNext() != null){
            iter = iter.getNext();
        }
        // create new node
        Node newNode = new Node(val, null);
        // link new node to end
        iter.setNext(newNode);

    }

    public static Node addToHead(Node chain ,Object val){

        return new Node(val, chain);
    }

    public static String toString(Node chain){
        return chain.getNext() != null ?
                chain.getVal() + "->" + toString(chain.getNext()) : chain.getVal().toString();
    }

    // 1,2,3,4,5
    public static Node createNode(Object...mas){

        if(mas.length < 1) return null;

        Node node = new Node(mas[0]);

        Object[] newMasForStep = Arrays.copyOfRange(mas, 1, mas.length);

        Node returnedNode = createNode(newMasForStep);

        node.setNext(returnedNode);

        return node;
    }

    public static Node createNodeR(Object...mas){
        return mas.length < 1 ? null :
                new Node(mas[0],
                        createNodeR(Arrays.copyOfRange(mas, 1, mas.length)));
    }

    public static int count(Node chain){
        return chain == null ? 0 : 1 + count(chain.getNext());
    }

    public static Node remove(Node chain, Object val){
        return chain;
    }

    public static Object[] toArray(Node chain){
        return null;
    }

    
}
