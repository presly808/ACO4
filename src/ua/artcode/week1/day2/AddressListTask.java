package ua.artcode.week1.day2;

import java.util.Scanner;

public class AddressListTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input size");
        int size = sc.nextInt();

        Address[] listAddress = new Address[size]; // null null null

        for(int i = 0; i < listAddress.length; i++){
            Address temp = new Address();

            System.out.println("Input city of " + i + " address");
            temp.city = sc.next();

            System.out.println("Input street of " + i + " address");
            temp.street = sc.next();

            System.out.println("Input num of " + i + " address");
            temp.num = sc.nextInt();

            listAddress[i] = temp;
        }

        for (int i = 0; i < listAddress.length; i++) {
            listAddress[i].printInfo();
        }
    }
}
