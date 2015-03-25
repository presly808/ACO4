package ua.artcode.dp.mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * size - in container
 * A B _ _ _ _ _ _ _
 */
public class UsersHolder { // my model

    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
