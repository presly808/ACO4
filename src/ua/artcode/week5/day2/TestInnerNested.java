package ua.artcode.week5.day2;

/**
 * Created by serhii on 15.03.15.
 */
public class TestInnerNested {

    public static void main(String[] args) {
        Flat flat = new Flat();

        flat.addRoom(12,"B");

        // for exaple only
        Flat.Room room = flat.new Room(12,"A"); // inner
        Flat.Window window = new Flat.Window(12,12);
    }
}
