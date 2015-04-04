package ua.artcode.sort;

import ua.artcode.utils.ArrayUtils;
import ua.artcode.week3.time.TimeTask;
import ua.artcode.week3.time.TimeTaskChecker;

import java.util.Arrays;

/**
 * Created by serhii on 04.04.15.
 */
public class TestMergeSort {

    public static void main(String[] args) {

        final int[] mas = ArrayUtils.genRandomMas(100_000,10_000); // O(n*logN)

        final int[] copy = Arrays.copyOfRange(mas,0,mas.length);

        final MergeSorter ms = new MergeSorter(); // O(N*logN)
        final SelectionSorter ss = new SelectionSorter(); // O(N*N)

        TimeTaskChecker timeTaskChecker = new TimeTaskChecker();
        timeTaskChecker.check(new TimeTask() {
            @Override
            public void perform() {
                ms.sort(mas);
            }
        });

        /*timeTaskChecker.check(new TimeTask() {
            @Override
            public void perform() {
                ss.sort(copy);
            }
        });
*/

    }
}
