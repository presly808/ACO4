package ua.artcode.algo.search;

import ua.artcode.week3.time.TimeTask;
import ua.artcode.week3.time.TimeTaskChecker;

/**
 * Created by serhii on 28.03.15.
 */
public class CompareLinAndBin {

    public static void main(String[] args) {

        final int[] mas = new int[100_000_000];
        for(int i = 0; i < mas.length; i++){
            mas[i] = i;
        }
        final int key = mas.length - 1;

        final BinarySearch binarySearch = new BinarySearch();

        TimeTask linTask = new TimeTask() {
            @Override
            public void perform() {
                for (int i = 0; i < mas.length; i++) {
                    if(mas[i] == key)
                        System.out.println("find key " + key);
                }
                //System.out.println("not found");
            }
        };


        TimeTask binaryTask = new TimeTask() {
            @Override
            public void perform() {
                System.out.println("find " +
                        binarySearch.search(mas, key));
            }
        };

        TimeTaskChecker timeTaskChecker = new TimeTaskChecker();
        timeTaskChecker.check(linTask);
        timeTaskChecker.check(binaryTask);


    }


}
