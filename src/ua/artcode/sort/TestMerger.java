package ua.artcode.sort;

import java.util.Arrays;

/**
 * Created by serhii on 28.03.15.
 */
public class TestMerger {

    public static void main(String[] args) {
            int[] mas1 = {1,2,4,56,433,2223};
            int[] mas2 = {2,4,33,56,122};


            Merger merger = new Merger();
            int[] res = merger.merge(mas1,mas2);
            System.out.println(Arrays.toString(res));



    }
}
