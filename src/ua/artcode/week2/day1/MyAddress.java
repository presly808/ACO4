package ua.artcode.week2.day1;

/**
 * Created by serhii on 14.02.15.
 */
public class MyAddress {

    private String city;
    private String street;
    private int num;

    public MyAddress(String city, String street, int num) {
        this.city = city;
        this.street = street;
        this.num = num;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNum() {
        return num;
    }


}
