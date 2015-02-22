package ua.artcode.sort;

import java.util.Arrays;

/**
 * Created by serhii on 21.02.15.
 */
public class SelectionSorterUniversal {

    public static void sort(Comparable[] mas) {

        if(mas == null || mas.length < 2) {
            return;
        }

        for(int i = 0; i < mas.length; i++){
            int minI = i;
            for(int j = i + 1; j < mas.length; j++){
                if(mas[minI].compareTo(mas[j]) > 0){
                    minI = j;
                }
            }
            swap(mas, i, minI);
        }
    }

    //change two columns in array
    public static void swap(Object[] mas, int a, int b)  {
        Object temp = mas[a];
        mas[a] = mas[b];
        mas[b] = temp;
    }




}
