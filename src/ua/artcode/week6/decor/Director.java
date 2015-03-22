package ua.artcode.week6.decor;

/**
 * Created by serhii on 22.03.15.
 */
public class Director extends WorkerDecorator {

    public Director(WorkerDecorator next) {
        super(next);
    }

    @Override
    public String work() {
        return "Director->" + (getNext() != null ? getNext().work() : "");
    }
}
