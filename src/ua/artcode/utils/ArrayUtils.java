package ua.artcode.utils;

public class ArrayUtils {

    public static int[] genRandomMas(int size, int range){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            // 0.74648273 * 10 = 7.46
            mas[i] = (int)(Math.random() * range);
        }
        return mas;
    }

    public static String toString(int[] arr){
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res = res + arr[i] + " | ";
        }
        return res;
    }

    public static int[] doSomeWithArrays(int[] arr1, int[] arr2){
        //ternary statement
        int size = arr1.length > arr2.length ?
                            arr1.length : arr2.length;

        int[] res = new int[size];

        for(int i = 0; i < size; i++){
            res[i] = (i < arr1.length ? arr1[i] : 0) +
                            (i < arr2.length ? arr2[i] : 0);
        }

        return res;
    }

}
