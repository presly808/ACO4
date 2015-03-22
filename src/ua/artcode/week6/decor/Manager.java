package ua.artcode.week6.decor;

/**
 * Created by serhii on 22.03.15.
 */
public class Manager extends WorkerDecorator {


    public Manager(WorkerDecorator next) {
        super(next);
    }

    @Override
    public String work() {

        return "Manager->" + (getNext() != null ? getNext().work() : "");
    }
}
