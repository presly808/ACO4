package ua.artcode.week6.decor;

/**
 * Created by serhii on 22.03.15.
 */
public abstract class WorkerDecorator implements WorkerAction {

    private WorkerDecorator next;

    public WorkerDecorator(WorkerDecorator next) {
        this.next = next;
    }

    public WorkerDecorator getNext() {
        return next;
    }

    public void setNext(WorkerDecorator next) {
        this.next = next;
    }
}
