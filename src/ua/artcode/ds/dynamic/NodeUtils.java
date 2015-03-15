package ua.artcode.ds.dynamic;

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
        return chain != null ?
                chain.getVal() + "->" + toString(chain.getNext()) : "";
    }

    public static Node createNode(Object[] mas){


        return null;
    }

    public static int count(Node chain){
        return -1;
    }

    public static Node remove(Node chain, Object val){
        return chain;
    }

    public static Object[] toArray(Node chain){
        return null;
    }

    
}
