package ua.artcode.week3.time;

/**
 * Created by serhii on 22.02.15.
 */
public class TimeTaskChecker {


    public void check(TimeTask task){
        long start = System.currentTimeMillis();
        task.perform();
        long end = System.currentTimeMillis();
        System.out.println("time task worked " + (end - start));
    }


}
