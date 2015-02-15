package ua.artcode.week2.day2.model;

/**
 *
 */
public class Notebook extends Product {

    private HDD hdd;
    private VideoAdapter videoAdapter;

    public Notebook(String model, double price) {
        super(model, price);

    }

    public Notebook(String model, double price,
                    HDD hdd, VideoAdapter videoAdapter) {
        super(model, price);
        this.hdd = hdd;
        this.videoAdapter = videoAdapter;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public VideoAdapter getVideoAdapter() {
        return videoAdapter;
    }

    public void setVideoAdapter(VideoAdapter videoAdapter) {
        this.videoAdapter = videoAdapter;
    }
}
