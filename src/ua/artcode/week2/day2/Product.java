package ua.artcode.week2.day2;

/**
 * Created by serhii on 15.02.15.
 */
public class Product {

    private String model;
    private double price;

    public Product() {
    }

    public Product(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
