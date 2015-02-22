package ua.artcode.sort;

import java.util.Arrays;

/**
 * Created by serhii on 21.02.15.
 */
public class SelectionSorter {

    public static void sort(int[] mas) {

        if(mas == null || mas.length < 2) {
            return;
        }

        for(int i = 0; i < mas.length; i++){
            int minI = i;
            for(int j = i + 1; j < mas.length; j++){
                if(mas[minI] > mas[j]){
                    minI = j;
                }
            }
            swap(mas, i, minI);
        }
    }

    //change two columns in array
    public static void swap(int[] mas, int a, int b)  {
        int temp = mas[a];
        mas[a] = mas[b];
        mas[b] = temp;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] mas = {65,23,11,4,3,88,34,86,23};
        System.out.println("BEFORE");
        System.out.println(Arrays.toString(mas));


        SelectionSorter sorter = new SelectionSorter();
        sorter.sort(mas);

        System.out.println("AFTER");
        System.out.println(Arrays.toString(mas));
    }




}
