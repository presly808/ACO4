package ua.artcode.week3;

/**
 * Created by serhii on 21.02.15.
 */
public class TestWrappers {

    public static void main(String[] args) {
        Integer integer = new Integer(56);
        // String ->
        int parsed = Integer.parseInt("45");
        Integer val = Integer.valueOf("23");


        // Autoboxing primitive -> Ref
        Integer box = 76; // Integer.valueOf(76)

        // Unboxing  Ref -> primitive
        int res = 45 + box; // box.intValue();


    }

}
