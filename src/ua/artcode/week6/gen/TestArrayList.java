package ua.artcode.week6.gen;

import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add("String");
        al.add(new Date());

        Integer obj = (Integer) al.get(2);
        System.out.println(obj);


        ArrayList<Integer> alGen = new ArrayList<Integer>();
        alGen.add(23);
        Integer i = alGen.get(0);
    }
}
