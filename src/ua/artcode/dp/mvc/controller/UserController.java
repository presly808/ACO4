package ua.artcode.dp.mvc.controller;

import ua.artcode.dp.mvc.model.User;
import ua.artcode.dp.mvc.model.UsersHolder;

/**
 * Created by serhii on 26.03.15.
 */
public class UserController {

    private UsersHolder usersHolder;

    public UserController(UsersHolder usersHolder) {
        this.usersHolder = usersHolder;
    }

    public void addUser(String name, int age){
        User user = new User(name, age);
        usersHolder.getUsers().add(user);
    }

    public void removeUser(String name){
        usersHolder.getUsers().remove(new User(name, 0));
    }

    public String getUserList(){
        StringBuilder sb = new StringBuilder();
        for(User u : usersHolder.getUsers()){
           sb.append(u.toString() + "\n");
        }
        return sb.toString();
    }



}
