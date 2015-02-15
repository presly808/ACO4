package ua.artcode.week2.day2.model;

/**
 * Created by serhii on 15.02.15.
 */
public class HDD extends Product {

    private int memory;
    private int speed;

    public HDD(String model, double price,
               int memory, int speed) {
        super(model, price);
        this.memory = memory;
        this.speed = speed;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
