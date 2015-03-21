package ua.artcode.week6.io;

import java.io.File;

/**
 * Created by serhii on 21.03.15.
 */
public class TestFile {


    public static final String PATHNAME = "/home/serhii/IdeaProjects/ACO4/temp";

    public static void main(String[] args) {
        File file = new File(PATHNAME);

        System.out.println("exists " + file.exists());
        System.out.println("name " + file.getName());
        System.out.println("path " + file.getPath());


    }
}
