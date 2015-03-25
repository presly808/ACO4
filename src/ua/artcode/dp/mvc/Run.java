package ua.artcode.dp.mvc;

import ua.artcode.dp.mvc.controller.UserController;
import ua.artcode.dp.mvc.model.UsersHolder;
import ua.artcode.dp.mvc.view.View;

/**
 * Created by serhii on 26.03.15.
 */
public class Run {

    public static void main(String[] args) {
        UsersHolder model = new UsersHolder();
        UserController controller = new UserController(model);
        View view = new View(controller);

        view.start();


    }

}
