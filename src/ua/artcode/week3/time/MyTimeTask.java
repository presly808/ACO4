package ua.artcode.week3.time;

import ua.artcode.sort.SelectionSorter;
import ua.artcode.utils.ArrayUtils;

/**
 * Created by serhii on 22.02.15.
 */
public class MyTimeTask implements TimeTask {
    @Override
    public void perform() {
        int[] mas = ArrayUtils.genRandomMas(100_000, 100);
        SelectionSorter.sort(mas);
    }
}
