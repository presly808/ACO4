package ua.artcode.home;

/**
 * Created by serhii on 21.02.15.
 */
public class
        MyArray {

    private int size;
    private Object[] mas;

    public MyArray() {
        mas = new Object[10];
    }

    public MyArray(int size) {
        mas = new Object[size];
    }

    public void add(Object val) {
        if (size < mas.length) {
            mas[size++] = val;
        } else {
            System.err.println("array is full, please resize");
        }
    }

    public Object getLast() {
        if (size > 0) {
            return mas[--size];
        }
        System.err.println("Array is empty");
        return null;
    }


    public void randomFilling() {

    }

    public Object min(){
        return null;
    }

    public void resize() {
        int newSize = size * 2;
        Object[] newArr = new Object[newSize];
        System.arraycopy(mas, 0, newArr, 0, mas.length);
        mas = newArr;
    }

   public void showAll(){
       for (int i = 0; i < size; i++) {
           System.out.println(mas[i].toString());
       }
   }

}
