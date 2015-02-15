package ua.artcode.week2.day2;

import ua.artcode.week2.day2.model.HDD;
import ua.artcode.week2.day2.model.Product;
import ua.artcode.week2.day2.model.VideoAdapter;

/**
 * Created by serhii on 15.02.15.
 */
public class TestAbstraction {


    public static void main(String[] args) {
        //ABSTRACTION
        Product product = new HDD("Hitachi", 300, 1000, 5600);

        HDD hdd = new HDD("Hitachi", 300, 1000, 5600);

        VideoAdapter adapter = new VideoAdapter("nvidia", 500, 1024, "discrete");


        printInfo(adapter);
        printInfo(hdd);
        printInfo(product);

    }

    public static void printInfo(Product product){
        System.out.printf("%s, %.3f", product.getModel(), product.getPrice());
    }

}
