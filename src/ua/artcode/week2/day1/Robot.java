package ua.artcode.week2.day1;


public class Robot {

    //package-private
    private int power;//0
    private double price;//0.0
    private String model;//null -> NUllPointerException
    private MyDate date;
    private MyAddress address;

    //default without args

    //overloaded constructor
    public Robot(int power, double price,
                 String model, MyDate date, MyAddress address){
        this.power = power;
        this.price = price;
        this.model = model;
        this.date = date;
        this.address = address;
    }


    //get , set
    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAll(int power, double price, String model){
        this.power = power;
        this.price = price;
        this.model = model;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    public MyAddress getAddress() {
        return address;
    }

    public void setAddress(MyAddress address) {
        this.address = address;
    }

    public String format(){
        return String.format("Robot={power=%d, price=%.2f, model=%s, date=%s}\n",
                power, price, model,
                date.format());
    }

    public String toString(){
        return String.format("Robot={power=%d, price=%.2f, model=%s, date=%s}\n",
                power, price, model,
                date != null ? date.format() : "");
    }
}
