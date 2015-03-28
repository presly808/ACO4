package ua.artcode.algo.search;

import java.util.Arrays;

/**
 * Created by serhii on 28.03.15.
 */
public class TestBinarySearch {

    public static void main(String[] args) {
        int[] mas = new int[16];

        for(int i = 0; i < mas.length; i++){
            mas[i] = i;
        }

        System.out.println(Arrays.toString(mas));

        BinarySearch binarySearch = new BinarySearch();

        int key = 1;
        int resIndex = binarySearch.search(mas, key);
        System.out.println(resIndex);




    }

}
