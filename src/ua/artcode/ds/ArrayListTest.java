package ua.artcode.ds;

import ua.artcode.week3.Human;

import java.util.ArrayList;

/**
 * Created by serhii on 28.02.15.
 */
public class ArrayListTest {

    public static void main(String[] args) {
        // ArrayList - dynamic array
        ArrayList al = new ArrayList();
        al.add("Andrey");
        al.add("Anton");
        al.add("Bogdan");
        al.add("Jack");


        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        al.remove(2);
        al.remove("Anton");

        System.out.println("AFTER REMOVE");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println(al.contains("Andrey"));

        System.out.println(al.isEmpty());

        System.out.println(al.indexOf("Andrey"));

        al.set(0,"Luck");
        al.add(0, "Jeday");


        System.out.println("**********************FOR-EACH");
        // for-each
        for(Object o : al){
            System.out.println(o);
        }


        int[] mas = {1,2,3,4,5,6,7};
        for(int iter : mas){
            iter = 8;
            System.out.print(iter + " ");
        }




    }


}
