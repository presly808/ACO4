package ua.artcode.week4;

/**
 * Created by serhii on 28.02.15.
 */
public class HumanWithStatic {

    private int num;
    private String name;

    private static int count;


    static { // while class loading
        initStatic();
    }

    private static void initStatic(){
        count = 0;
    }

    public HumanWithStatic() {
    }

    public HumanWithStatic(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public HumanWithStatic(String name) {
        this.name = name;
    }

    public HumanWithStatic(int num) {
        this.num = num;
    }

    //addition block for all constructors
    {
        count++;
    }

    public void testNonStatic(){
        count++;
    }

    public static void testStatic(){
        count++;
    }

    public static int getCount(){
        return count;
    }


}
