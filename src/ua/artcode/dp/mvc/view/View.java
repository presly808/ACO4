package ua.artcode.dp.mvc.view;

import ua.artcode.dp.mvc.controller.UserController;

import java.util.Scanner;

/**
 *
 */
public class View {

    private UserController controller;
    private Scanner sc = new Scanner(System.in);


    public View(UserController controller) {
        this.controller = controller;
    }

    public void start(){
        while (true){
            showMenu();
            int choice = sc.nextInt();
            choiceDispatcher(choice);
        }
    }

    public void showMenu(){
        System.out.println("1. add user");
        System.out.println("2. remove user");
        System.out.println("3. show users");
    }

    public void choiceDispatcher(int choice){
        switch (choice) {
            case 1 : {
                showAddUser();
                break;
            }

            case 2 : {
                showRemoveUserMenu();
                break;
            }

            case 3 : {
                showUsers();
                break;
            }
        }
    }

    private void showUsers() {
        System.out.println(controller.getUserList());
    }

    private void showRemoveUserMenu() {
        System.out.println("Input name");
        String name = sc.next();

        controller.removeUser(name);
    }



    public void showAddUser(){
        System.out.println("Input name");
        String name = sc.next();

        System.out.println("Input age");
        int age = sc.nextInt();

        controller.addUser(name,age);
    }







}
