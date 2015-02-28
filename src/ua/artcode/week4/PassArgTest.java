package ua.artcode.week4;

import java.util.Arrays;

/**
 * Created by serhii on 28.02.15.
 */
public class PassArgTest {

    public static void main(String[] args) {
        int value = 10;
        String str = "old";
        int[] arr = {1,2,3,4,5,6,7};
        //      copy
        passArg(value, str, arr);

        System.out.println(value);
        System.out.println(str);
        System.out.println(Arrays.toString(arr));



    }


    //How to pass arguments into method
    //primitive pass by value
    // pass by reference
    public static void passArg(int a, String desc, int[] mas){
        a = 100;
        desc = "new desc";
        mas[3] = 100;
    }

}
