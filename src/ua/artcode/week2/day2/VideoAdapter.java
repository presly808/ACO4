package ua.artcode.week2.day2;

/**
 * Created by serhii on 15.02.15.
 */
public class VideoAdapter extends Product {

    private int memory;
    private String type;

    public VideoAdapter(String model, double price,
                        int memory, String type) {
        super(model, price);
        this.memory = memory;
        this.type = type;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
