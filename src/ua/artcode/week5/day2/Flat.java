package ua.artcode.week5.day2;

import java.util.ArrayList;

/**
 * Created by serhii on 15.03.15.
 */
public class Flat {

    private ArrayList<Room> rooms = new ArrayList<>();
    private String address;
    private Window window;

    public Flat() {
    }

    public void addRoom(int sqr, String name){
        Room room = new Room(sqr, name);
        rooms.add(room);
        window = new Window(3,20);

    }

    // nested class
    public static class Window {
        int height;
        int wight;

        public Window(int height, int wight) {
            this.height = height;
            this.wight = wight;
        }

        public void test(){

        }
    }

    // inner class
    public class Room {
        int sqr;
        String name;
        Flat flat;

        public Room(int sqr, String name) {
            this.sqr = sqr;
            this.name = name;
        }

        public void test(){
            System.out.println(address);
            flat = Flat.this;
        }
    }


}
