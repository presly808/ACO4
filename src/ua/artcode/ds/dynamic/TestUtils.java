package ua.artcode.ds.dynamic;

/**
 * Created by serhii on 15.03.15.
 */
public class TestUtils {

    public static void main(String[] args) {
        Node node = NodeUtils.createNodeR("a","b","c","d");
        System.out.println(NodeUtils.toString(node));
        //NodeUtils.createNodeR(new String[]{"a","b","c","d"});
    }
}
