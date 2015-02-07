package ua.artcode.week1;

import java.util.Scanner;
import ua.artcode.utils.ArrayUtils;

public class TestArraysAction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input size of first arr");
        int size1 = sc.nextInt(); //blocking method
        System.out.println("Input size of second arr");
        int size2 = sc.nextInt();
        System.out.println("Input range");
        int range = sc.nextInt();

        int[] mas1 = ArrayUtils.genRandomMas(size1,range);
        System.out.println(ArrayUtils.toString(mas1));

        int[] mas2 = ArrayUtils.genRandomMas(size2,range);
        System.out.println(ArrayUtils.toString(mas2));

        int[] res = ArrayUtils.doSomeWithArrays(mas1,mas2);
        System.out.println(ArrayUtils.toString(res));



    }

}
