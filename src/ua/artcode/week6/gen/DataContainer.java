package ua.artcode.week6.gen;

// 1. Declare generic type <T> in class or <T,V> if two or more gen type
// 2. Then use declared type T
// 3. Can limit by type condition
public class DataContainer <T extends Comparable> {
    
    private T val;

    public DataContainer() {
    }

    public DataContainer(T val) {
        this.val = val;
    }
    
    public void testGen(){
        val.toString();
    }

    public static void testGenStat(){
        //T t = null;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
