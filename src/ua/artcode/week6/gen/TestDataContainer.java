package ua.artcode.week6.gen;

/**
 * Created by serhii on 22.03.15.
 */
public class TestDataContainer {

    public static void main(String[] args) {
        DataContainer<String> dataContainer = new DataContainer<String>();
        dataContainer.setVal("Vova");

        System.out.println(dataContainer.getVal());

    }

}
