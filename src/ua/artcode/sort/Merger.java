package ua.artcode.sort;

/**
 * Created by serhii on 28.03.15.
 */
public class Merger {


    public int[] merge(int[] mas1, int[] mas2){

        int[] res = new int[mas1.length + mas2.length];
        int j = 0,i = 0;

        for (int k = 0; k < res.length; k++) {
            if(j >= mas2.length){
                res[k] = mas1[i++];
            } else if(i >= mas1.length){
                res[k] = mas2[j++];
            } else if(mas1[i] < mas2[j]){
                res[k] = mas1[i++];
            } else {
                res[k] = mas2[j++];
            }
        }

        return res;
    }
}
