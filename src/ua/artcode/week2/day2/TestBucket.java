package ua.artcode.week2.day2;

import ua.artcode.week2.day2.model.HDD;
import ua.artcode.week2.day2.model.ProductBucket;
import ua.artcode.week2.day2.model.VideoAdapter;

/**
 * Created by serhii on 15.02.15.
 */
public class TestBucket {

    public static void main(String[] args) {
        ProductBucket pb = new ProductBucket();

        HDD hdd1 = new HDD("Hitachi", 300, 1000, 5600);
        HDD hdd = new HDD("Hitachi", 300, 1000, 5600);
        VideoAdapter adapter = new VideoAdapter("nvidia", 500, 1024, "discrete");

        pb.addToBucket(hdd);
        pb.addToBucket(hdd1);
        pb.addToBucket(adapter);

        System.out.println(pb.getAmountPrice());


    }

}
