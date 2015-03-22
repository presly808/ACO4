package ua.artcode.week6.serial;

import java.io.IOException;

/**
 * Created by serhii on 22.03.15.
 */
public interface DataSaver {

    void save(String path, UserSerail userSerail);

    UserSerail load(String path);

}
