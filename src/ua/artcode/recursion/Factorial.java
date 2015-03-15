package ua.artcode.recursion;

/**
 * Created by serhii on 15.03.15.
 */
public class Factorial {


    public static int fact(int num) {
        // exit condition
        if(num < 2) return 1;

        //recursion and step
        int returnedRes = fact(num - 1);

        // action of method
        int resOfMethod = num * returnedRes;

        // return
        return resOfMethod;
    }

    public static int factOneLine(int num){
        return num < 2 ? 1 : num * factOneLine(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }


}
