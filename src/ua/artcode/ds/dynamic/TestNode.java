package ua.artcode.ds.dynamic;

/**
 * Created by serhii on 14.03.15.
 */
public class TestNode {

    public static void main(String[] args) {
        Node node = new Node(1);

        Node node1 = new Node(2);
        node.setNext(node1);

        Node node2 = new Node(3);
        node1.setNext(node2);


        NodeUtils.addToTail(node, 4);
        NodeUtils.addToTail(node, 5);
        NodeUtils.addToTail(node, 6);
        NodeUtils.addToTail(node, 7);

        System.out.println(NodeUtils.toString(node));



    }

}
