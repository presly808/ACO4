package ua.artcode.week3.time;

/**
 * Created by serhii on 22.02.15.
 */
public class TestTimeChecker {

    public static void main(String[] args) {

        TimeTaskChecker timeTaskChecker = new TimeTaskChecker();
        MyTimeTask myTimeTask = new MyTimeTask();
        timeTaskChecker.check(myTimeTask);


    }
}
