package ua.artcode.sort;

import java.util.Arrays;

/**
 * Created by serhii on 21.02.15.
 */
public class SelectionSorter {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void sort(int[] mas) throws InterruptedException {

        if(mas == null || mas.length < 2) {
            return;
        }

        for(int i = 0; i < mas.length; i++){
            int minI = i;
            for(int j = i + 1; j < mas.length; j++){
                System.out.print("CURR: ");
                show(mas, i, j);
                Thread.sleep(1000);
                if(mas[minI] > mas[j]){
                    minI = j;
                }
            }
            swap(mas, i, minI);
        }
    }

    //change two columns in array
    public static void swap(int[] mas, int a, int b) throws InterruptedException {
        System.out.print("SWAP: ");
        show(mas,a,b);
        Thread.sleep(1000);
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


    public static void show(int[] mas, int minI, int curr){
        String res = "";
        for (int i = 0; i < mas.length; i++) {
            if(i == minI){
                res += ANSI_RED + mas[i] + ANSI_RESET + ",";
            } else if (i == curr) {
                res += ANSI_BLUE + mas[i] + ANSI_RESET + ",";
            } else {
                res += mas[i] + ",";
            }
        }
        System.out.println(res);
    }


}
